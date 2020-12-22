package by.training.jwd.task2.main;

import java.util.List;


import by.training.jwd.task2.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {
		if (appliance != null) {
			System.out.println("Товар найден ");
		for (Appliance appls:appliance) {
			System.out.println(appls.toString());
		}
		
		
		} else {
			System.out.println("Товар не найден");
		}
	}

}
