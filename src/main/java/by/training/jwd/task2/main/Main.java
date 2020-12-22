package by.training.jwd.task2.main;

import static by.training.jwd.task2.entity.criteria.SearchCriteria.*;

import java.io.IOException;
import java.util.List;

import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.criteria.Criteria;
import by.training.jwd.task2.service.ApplianceService;
import by.training.jwd.task2.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 40);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "red");
		
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

	}

}
