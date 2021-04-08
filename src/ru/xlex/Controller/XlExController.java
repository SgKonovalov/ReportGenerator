package ru.xlex.Controller;

import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.xlex.DataModel.DataModel;
import ru.xlex.ExcelGen.DataFilling;
import ru.xlex.ExcelGen.FileGenAndShow;

@Controller
@RequestMapping("/start/")
public class XlExController {

	List<DataModel> dataList = DataFilling.fillModels();
	
	@RequestMapping(method = RequestMethod.GET)
	public String allNumbers(Model uiModel) {
		
		uiModel.addAttribute("dataList", dataList);
		return "main\\start";
	}
	
	@RequestMapping(value = "reportByEven/",method = RequestMethod.GET)
	public String reportLoadAndShow(Model uiModel) throws IOException {
		
		FileGenAndShow gF = new FileGenAndShow();
		gF.generateFile(dataList);
		gF.showFile();
		return "redirect:/start/";
	}
}