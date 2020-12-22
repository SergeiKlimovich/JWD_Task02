package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.Oven;

public class OvenCreator implements Command {
	 public Appliance execute(String[] obj) {
	        Oven oven = new Oven();
	        oven.setPowerConsumption(Integer.parseInt(obj[0]));
	        oven.setWeight(Integer.parseInt(obj[1]));
	        oven.setCapacity(Integer.parseInt(obj[2]));
	        oven.setDepth(Integer.parseInt(obj[3]));
	        oven.setHeight(Float.parseFloat(obj[4]));
	        oven.setWidth(Float.parseFloat(obj[5]));
	        return oven;
	    }
	}
