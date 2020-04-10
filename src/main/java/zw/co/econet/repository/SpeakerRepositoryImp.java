package zw.co.econet.repository;

import zw.co.econet.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImp implements SpeakerRepository {

    private Speaker speaker;
    @Override
    public List<Speaker> findSpeaker(){
        List<Speaker> speakers = new ArrayList<>();

        speaker.setFname("Marvelous");
        speaker.setLname("Mashamba");
        speakers.add(speaker);

        return speakers;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
