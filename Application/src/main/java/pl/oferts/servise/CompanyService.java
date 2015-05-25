package pl.oferts.servise;


import pl.oferts.dto.NewCompanyDTO;
import pl.oferts.model.Company;

public interface CompanyService {

    Long createNewCompany(Company company);


}
