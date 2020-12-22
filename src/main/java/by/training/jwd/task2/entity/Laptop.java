package by.training.jwd.task2.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable {

	private static final long serialVersionUID = 6481738220713191476L;
	private float battaryCapacity;
	private String OS;
	private int memoryRom;
	private int systemMemory;
	private float cpu;
	private int displayInchs;

	public Laptop() {

	}

	public Laptop(float battaryCapacity, String oS, int memoryRom, int systemMemory, float cpu, int displayInchs) {

		this.battaryCapacity = battaryCapacity;
		OS = oS;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public float getBattaryCapacity() {
		return battaryCapacity;
	}

	public void setBattaryCapacity(float battaryCapacity) {
		this.battaryCapacity = battaryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String OS) {
		this.OS = OS;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		result = prime * result + Float.floatToIntBits(battaryCapacity);
		result = prime * result + Float.floatToIntBits(cpu);
		result = prime * result + displayInchs;
		result = prime * result + memoryRom;
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (Float.floatToIntBits(battaryCapacity) != Float.floatToIntBits(other.battaryCapacity))
			return false;
		if (Float.floatToIntBits(cpu) != Float.floatToIntBits(other.cpu))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [battaryCapacity=" + battaryCapacity + ", OS=" + OS + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}

}
