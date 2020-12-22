package by.training.jwd.task2.service.validation;

import java.util.Map;

import by.training.jwd.task2.entity.criteria.Criteria;

public class Validator {
	private static String intValue = new String(
			"POWER_CONSUMPTION" + "MEMORY_ROM" + "SYSTEM_MEMORY" + "MOTOR_SPEED_REGULATION" + "NUMBER_OF_SPEAKERS");
	private static String stringValue = new String("OS" + "FILTER_TYPE" + "BAG_TYPE" + "WAND_TYPE" + "COLOR");
	private static String rangeValue = new String("FREQUENCY_RANGE");
	private static String floatValue = new String("WEIGHT" + "CAPACITY" + "DEPTH" + "HEIGHT" + "WIDTH"
			+ "BATTERY_CAPACITY" + "CPU" + "DISPLAY_INCHS" + "FREEZER_CAPACITY" + "OVERALL_CAPACITY" + "CLEANING_WIDTH"
			+ "DISPLAY_INCHES" + "FLASH_MEMORY_CAPACITY" + "CORD_LENGTH");

	public static boolean criteriaValidator(Criteria criteria) {
		for (Map.Entry<String, Object> map : criteria.getMap().entrySet()) {
			if (map.getValue() == null) {
				return false;
			}
			if (intValue.contains(map.getKey().toString())) {
				try {
					Integer.parseInt(map.getValue().toString());
				} catch (NumberFormatException e) {
					System.out.println("Введено не целое значение для категории " + map.getKey() + " товара"
							+ criteria.getGroupSearchName());
					return false;
				}
			}
			if (stringValue.contains(map.getKey().toString())) {
				if (map.getValue().toString() == null || map.getValue().toString().length() == 0) {
					System.out.println("Введено неверное значение для категории " + map.getKey() + " товара"
							+ criteria.getGroupSearchName());
					return false;
				}
			}
			if (rangeValue.contains(map.getKey().toString())) {
				String range = new String(map.getValue().toString());
				if (!range.matches("\\d+(\\.\\d+)?-\\d+(\\.\\d+)?")) {
					System.out.println("Введен не диапазон для категории " + map.getKey() + " прибора "
							+ criteria.getGroupSearchName());
					return false;
				}
			}
			if (floatValue.contains(map.getKey().toString())) {
				try {
					Float.parseFloat(map.getValue().toString());
				} catch (NumberFormatException e) {
					System.out.println("Введено не число для категории " + map.getKey() + " прибора "
							+ criteria.getGroupSearchName());
					return false;
				}
			}
		}
		return true;
	}
}
