package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.VacuumCleaner;

public class VacuumCleanerCreator implements Command{

	public Appliance execute(String[] obj) {
	        VacuumCleaner vacuumCleaner = new VacuumCleaner();
	        vacuumCleaner.setPowerConsumption(Integer.parseInt(obj[0]));
	        vacuumCleaner.setFilterType(obj[1]);
	        vacuumCleaner.setBagType(obj[2]);
	        vacuumCleaner.setWandType(obj[3]);
	        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(obj[4]));
	        vacuumCleaner.setCleaningWidth(Integer.parseInt(obj[5]));
	        return vacuumCleaner;
	    }
}
