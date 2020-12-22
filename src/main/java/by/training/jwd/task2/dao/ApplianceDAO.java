package by.training.jwd.task2.dao;

import java.util.List;

// готов
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
