package by.training.jwd.task2.service.impl;


import java.util.List;

import by.training.jwd.task2.dao.ApplianceDAO;
import by.training.jwd.task2.dao.DAOFactory;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.criteria.Criteria;
import by.training.jwd.task2.service.ApplianceService;
import by.training.jwd.task2.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance = applianceDAO.find(criteria);

	

		return appliance;
	}

}


