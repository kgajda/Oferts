package pl.oferts.servise

import pl.oferts.model.Company
import pl.oferts.repository.CompanyRepository
import spock.lang.Specification

class CompanyServiceImplTest extends Specification {
    def "add new Company test"() {
        setup:
        def compa = new Company();
        def service = new CompanyServiceImpl();
        service.companyRepository = new CompanyRepository() {
            @Override
            Long save(Company company) {
                return 1L;
            }
        }

        expect:
        service.createNewCompany(compa) == 1;

    }
}
