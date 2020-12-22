package by.training.jwd.task2.dao;

import java.util.HashMap;
import java.util.Map;

import by.training.jwd.task2.dao.impl.CommandImpl.LaptopCreator;
import by.training.jwd.task2.dao.impl.CommandImpl.OvenCreator;
import by.training.jwd.task2.dao.impl.CommandImpl.RefrigeratorCreator;
import by.training.jwd.task2.dao.impl.CommandImpl.SpeakersCreator;
import by.training.jwd.task2.dao.impl.CommandImpl.TabletPCCreator;
import by.training.jwd.task2.dao.impl.CommandImpl.VacuumCleanerCreator;


public class ApplianceDirector {
	Map<String, Command> map = new HashMap<String, Command>();

	public ApplianceDirector() {
		map.put("Oven", new OvenCreator());
		map.put("Laptop", new LaptopCreator());
		map.put("Refrigerator", new RefrigeratorCreator());
		map.put("VacuumCleaner", new VacuumCleanerCreator());
		map.put("TabletPC", new TabletPCCreator());
		map.put("Speakers", new SpeakersCreator());
	}

	public Command getCommand(String typeName) {
		Command command;
		command = map.get(typeName);
		return command;

	}
}
