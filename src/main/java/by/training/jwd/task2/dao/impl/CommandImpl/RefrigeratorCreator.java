package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.Refrigerator;

public class RefrigeratorCreator implements Command {
	public Appliance execute(String[] obj) {
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.setPowerConsumption(Integer.parseInt(obj[0]));
		refrigerator.setWeight(Integer.parseInt(obj[1]));
		refrigerator.setFreezerCapacity(Integer.parseInt(obj[2]));
		refrigerator.setOverallCapacity(Float.parseFloat(obj[3]));
		refrigerator.setHeight(Float.parseFloat(obj[4]));
		refrigerator.setWidth(Float.parseFloat(obj[5]));
		return refrigerator;
	}
}
