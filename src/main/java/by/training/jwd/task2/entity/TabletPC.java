package by.training.jwd.task2.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float battaryCapacity;
	private int displayInchs;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String Color;
	
	
	public TabletPC() {
		
	}
	public TabletPC(float battaryCapacity, int displayInchs, int memoryRom, int flashMemoryCapacity, String color) {
		super();
		this.battaryCapacity = battaryCapacity;
		this.displayInchs = displayInchs;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		Color = color;
	}
	public float getBattaryCapacity() {
		return battaryCapacity;
	}
	public void setBattaryCapacity(float battaryCapacity) {
		this.battaryCapacity = battaryCapacity;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Color == null) ? 0 : Color.hashCode());
		result = prime * result + Float.floatToIntBits(battaryCapacity);
		result = prime * result + displayInchs;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (Color == null) {
			if (other.Color != null)
				return false;
		} else if (!Color.equals(other.Color))
			return false;
		if (Float.floatToIntBits(battaryCapacity) != Float.floatToIntBits(other.battaryCapacity))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TabletPC [battaryCapacity=" + battaryCapacity + ", displayInchs=" + displayInchs + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", Color=" + Color + "]";
	}

}
