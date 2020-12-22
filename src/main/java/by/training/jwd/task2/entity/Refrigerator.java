package by.training.jwd.task2.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int powerConsumption;
	private int weight;
	private int FreezerCapacity;
	private float OverallCapacity;
	private float height;
	private float width;

	public Refrigerator() {

	}

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, float overallCapacity, float height,
			float width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		FreezerCapacity = freezerCapacity;
		OverallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return FreezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		FreezerCapacity = freezerCapacity;
	}

	public float getOverallCapacity() {
		return OverallCapacity;
	}

	public void setOverallCapacity(float overallCapacity) {
		OverallCapacity = overallCapacity;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + FreezerCapacity;
		result = prime * result + Float.floatToIntBits(OverallCapacity);
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + Float.floatToIntBits(width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (FreezerCapacity != other.FreezerCapacity)
			return false;
		if (Float.floatToIntBits(OverallCapacity) != Float.floatToIntBits(other.OverallCapacity))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", FreezerCapacity="
				+ FreezerCapacity + ", OverallCapacity=" + OverallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

}
