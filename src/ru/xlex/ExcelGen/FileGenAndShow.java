package ru.xlex.ExcelGen;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import ru.xlex.DataModel.DataModel;

public class FileGenAndShow {

	private final static String fileName = "D:/javaprojects/Report.xls";
	
	private static void createSheet(HSSFSheet sheet, int rowNum, DataModel dM) {

		Row myRow = sheet.createRow(rowNum);

		if (dM.getNumberByFirstColumn() % 2 == 0)
			myRow.createCell(0).setCellValue(dM.getNumberByFirstColumn());

		if (dM.getNumberBySecondColumn() % 2 == 0)
			myRow.createCell(1).setCellValue(dM.getNumberBySecondColumn());

		if (dM.getNumberByThirdColumn() % 2 == 0)
			myRow.createCell(2).setCellValue(dM.getNumberByThirdColumn());

		if (dM.getNumberByFourthColumn() % 2 == 0)
			myRow.createCell(3).setCellValue(dM.getNumberByFourthColumn());
	}

	@SuppressWarnings("resource")
	public void generateFile(List<DataModel> dataList) throws IOException {

		HSSFWorkbook workbook = new HSSFWorkbook();
		
		HSSFSheet sheet = workbook.createSheet("Основной лист");

		int rowNumrs = 0;

		Row rows = sheet.createRow(rowNumrs);

		rows.createCell(0).setCellValue("Первый столбец");
		rows.createCell(1).setCellValue("Второй столбец");
		rows.createCell(2).setCellValue("Третий столбец");
		rows.createCell(3).setCellValue("Четвёртый столбец");

		for (DataModel dM : dataList) {
			createSheet(sheet, ++rowNumrs, dM);
		}

		try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {

			workbook.write(fos);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public synchronized void showFile() {
		
		 File file = new File(fileName);
		
		while (!file.exists())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		Desktop desktop = null;

		if (Desktop.isDesktopSupported()) {
			desktop = Desktop.getDesktop();
		}

		try {
			desktop.open(new File(fileName));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}