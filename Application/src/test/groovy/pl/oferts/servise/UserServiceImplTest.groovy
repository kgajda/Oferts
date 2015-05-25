package pl.oferts.servise

import pl.oferts.model.User
import spock.lang.Specification


class UserServiceImplTest extends Specification {
    def "RegistrNewUser"() {
        setup:
        def usr = new User();
        def userService = new UserService() {
            @Override
            Long registrNewUser(User user) {
                return 1L
            }
        }

        expect:
        userService.registrNewUser(usr) == 1;
    }
}
