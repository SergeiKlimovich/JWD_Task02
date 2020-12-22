package by.training.jwd.task2.entity.criteria;


import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void setGroupSearchName(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object> getMap() {
		return criteria;
	}

	public String[] getCriterion() {
		String[] criterion = new String[criteria.size() + 1];
		criterion[0] = groupSearchName;
		int i = 1;
		for (Map.Entry<String, Object> map : criteria.entrySet()) {
			criterion[i] = map.getKey().toString() + "=" + map.getValue().toString();
			i++;
		}
		return criterion;
	}

}
