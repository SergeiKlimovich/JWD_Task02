package by.training.jwd.task2.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.training.jwd.task2.dao.ApplianceDAO;
import by.training.jwd.task2.dao.ApplianceDirector;
import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	public List<Appliance> find(Criteria criteria) {
		List<Appliance> appl = new ArrayList<Appliance>();
		String[] criterion = criteria.getCriterion();
		File file = new File("resource\\appliances_db.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			try {
				String line;
				while ((line = reader.readLine()) != null) {
					boolean isTrue = true;
					for (String i : criterion) {
						if (line.contains(i + " :") || line.contains(i + ",") || line.contains(i + ";")) {

							isTrue = true;
						} else {
							isTrue = false;
							break;
						}
					}
					if (isTrue) {
						ApplianceDirector director = new ApplianceDirector();
						Command command = director.getCommand(criteria.getGroupSearchName());
						appl.add(command.execute(lineToArray(line)));
					}
				}
				return appl;
			} finally {
				reader.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
//		return null;
	}

	private static String[] lineToArray(String line) {
		String newline = line.replaceAll(" :|,|;", "");
		String[] pairs = newline.split("\\s");
		String[] values = new String[pairs.length - 1];
		for (int i = 0; i < values.length; i++) {
			String[] tempPair = pairs[i + 1].split("=");
			values[i] = tempPair[1];
		}
		return values;

	}

}
