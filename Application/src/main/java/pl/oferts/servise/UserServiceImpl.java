package pl.oferts.servise;

import pl.oferts.model.User;
import pl.oferts.repository.UserRepository;

/**
 * Created by karol on 25.05.15.
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public Long registrNewUser(User user) {
        Long id = userRepository.save(user);
        return id;
    }
}
