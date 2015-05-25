package pl.oferts.repository;

import pl.oferts.model.Thing;

/**
 * Created by karol on 25.05.15.
 */
public interface ThingRepository {

    Long save(Thing thing);
}
