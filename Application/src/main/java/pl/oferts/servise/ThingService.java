package pl.oferts.servise;

import pl.oferts.model.FullSpecyfication;
import pl.oferts.model.Thing;

/**
 * Created by karol on 25.05.15.
 */
public interface ThingService {

    Long createNewThing(Thing thing,FullSpecyfication fullSpecyfication);

}
