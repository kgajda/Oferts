package pl.oferts.servise;

import pl.oferts.dto.NewCompanyDTO;
import pl.oferts.model.Company;
import pl.oferts.repository.CompanyRepository;

public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    @Override
    public Long createNewCompany(Company company) {
        return companyRepository.save(company);
    }
}
