package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.Laptop;

public class LaptopCreator implements Command {
	public Appliance execute(String[] obj) {
        Laptop laptop = new Laptop();
        laptop.setBattaryCapacity(Float.parseFloat(obj[0]));
        laptop.setOS(obj[1]);
        laptop.setMemoryRom(Integer.parseInt(obj[2]));
        laptop.setSystemMemory(Integer.parseInt(obj[3]));
        laptop.setCpu(Float.parseFloat(obj[4]));
        laptop.setDisplayInchs(Integer.parseInt(obj[5]));
        return laptop;
    }
}

