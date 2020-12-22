package by.training.jwd.task2.dao;

import by.training.jwd.task2.entity.Appliance;

public interface Command {
Appliance execute(String[] obj);
}
