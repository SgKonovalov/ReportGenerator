package ru.xlex.DataModel;

public class DataModel {
	
	private int numberByFirstColumn;
	private int numberBySecondColumn;
	private int numberByThirdColumn;
	private int numberByFourthColumn;
	
	public DataModel () {}
	
	public DataModel (int numberByFirstColumn, int numberBySecondColumn, int numberByThirdColumn, int numberByFourthColumn) {
		this.numberByFirstColumn = numberByFirstColumn;
		this.numberBySecondColumn = numberBySecondColumn;
		this.numberByThirdColumn = numberByThirdColumn;
		this.numberByFourthColumn = numberByFourthColumn;
	}

	public int getNumberByFirstColumn() {
		return numberByFirstColumn;
	}

	public void setNumberByFirstColumn(int numberByFirstColumn) {
		this.numberByFirstColumn = numberByFirstColumn;
	}

	public int getNumberBySecondColumn() {
		return numberBySecondColumn;
	}

	public void setNumberBySecondColumn(int numberBySecondColumn) {
		this.numberBySecondColumn = numberBySecondColumn;
	}

	public int getNumberByThirdColumn() {
		return numberByThirdColumn;
	}

	public void setNumberByThirdColumn(int numberByThirdColumn) {
		this.numberByThirdColumn = numberByThirdColumn;
	}

	public int getNumberByFourthColumn() {
		return numberByFourthColumn;
	}

	public void setNumberByFourthColumn(int numberByFourthColumn) {
		this.numberByFourthColumn = numberByFourthColumn;
	}

}