package by.training.jwd.task2.service;

import java.util.List;


import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.criteria.Criteria;

public interface ApplianceService {

	List <Appliance> find(Criteria criteria);

}
