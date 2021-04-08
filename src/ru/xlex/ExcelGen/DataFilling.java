package ru.xlex.ExcelGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ru.xlex.DataModel.DataModel;

public class DataFilling {
	
	public static List<DataModel> fillModels () {
		
		Random random = new Random();
		
		List<DataModel> filled = new ArrayList<DataModel>();
		
		filled.add(new DataModel (random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
		filled.add(new DataModel (random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
		filled.add(new DataModel (random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
		filled.add(new DataModel (random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
		filled.add(new DataModel (random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
		
		return filled;
	}

}
