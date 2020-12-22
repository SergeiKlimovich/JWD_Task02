package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.TabletPC;

public class TabletPCCreator implements Command{
	 public Appliance execute(String[] obj) {
	        TabletPC tabletPC = new TabletPC();
	        tabletPC.setBattaryCapacity(Float.parseFloat(obj[0]));
	        tabletPC.setDisplayInchs(Integer.parseInt(obj[1]));
	        tabletPC.setMemoryRom(Integer.parseInt(obj[2]));
	        tabletPC.setFlashMemoryCapacity(Integer.parseInt(obj[3]));
	        tabletPC.setColor(obj[4]);
	        return tabletPC;
	    }
	}
