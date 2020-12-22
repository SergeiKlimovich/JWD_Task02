package by.training.jwd.task2.dao.impl.CommandImpl;

import by.training.jwd.task2.dao.Command;
import by.training.jwd.task2.entity.Appliance;
import by.training.jwd.task2.entity.Speakers;

public class SpeakersCreator implements Command {
	public Appliance execute(String[] obj) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt(obj[0]));
        speakers.setNumberOfSpeakers(Integer.parseInt(obj[1]));
        speakers.setFrequencyRange(obj[2]);
        speakers.setCordLength(Integer.parseInt(obj[3]));
        return speakers;
    }
}