package pl.oferts.servise;

import pl.oferts.model.FullSpecyfication;
import pl.oferts.model.Thing;
import pl.oferts.repository.SpecyficationRepository;
import pl.oferts.repository.ThingRepository;

/**
 * Created by karol on 25.05.15.
 */
public class ThingServiceImpl implements ThingService {

    public SpecyficationRepository specyficationRepository;
    public ThingRepository thingRepository;

    @Override
    public Long createNewThing(Thing thing,FullSpecyfication fullSpecyfication) {
        specyficationRepository.save(fullSpecyfication);
        thing.addSpecyficationAfterInstertToDB(fullSpecyfication);
        return thingRepository.save(thing);
    }
}
