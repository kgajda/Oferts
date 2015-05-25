package pl.oferts.servise

import pl.oferts.model.FullSpecyfication
import pl.oferts.model.Image
import pl.oferts.model.Thing
import pl.oferts.repository.SpecyficationRepository
import pl.oferts.repository.ThingRepository
import spock.lang.Specification

/**
 * Created by karol on 25.05.15.
 */
class ThingServiceImplTest extends Specification {
    def "test createNewThing"() {
        given:
        def th = new Thing();
        def spec = new FullSpecyfication();
        def service = new ThingServiceImpl();
        spec.setSmallImage(new Image());
        service.thingRepository = new ThingRepository() {
            @Override
            Long save(Thing thing) {
                thing.setId(1L);
                return 1L;
            }
        }
        service.specyficationRepository = new SpecyficationRepository() {
            @Override
            Long save(FullSpecyfication fullSpecyfication) {
                fullSpecyfication.setId(2L);
                return 2L;
            }
        }

        when:
        service.createNewThing(th,spec);
        then:
        th.getId() == 1L;
        th.getFullSpecyficationId() ==2L;
    }
}
