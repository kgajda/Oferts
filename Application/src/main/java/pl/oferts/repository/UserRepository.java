package pl.oferts.repository;

import pl.oferts.model.User;

/**
 * Created by karol on 25.05.15.
 */
public interface UserRepository {

    Long save(User user);
}
