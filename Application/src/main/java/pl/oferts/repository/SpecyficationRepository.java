package pl.oferts.repository;

import pl.oferts.model.FullSpecyfication;

/**
 * Created by karol on 25.05.15.
 */
public interface SpecyficationRepository {
    Long save(FullSpecyfication fullSpecyfication);
}
