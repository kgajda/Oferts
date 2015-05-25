package pl.oferts.repository;

import pl.oferts.model.Company;

/**
 * Created by karol on 24.05.15.
 */
public interface CompanyRepository {
    Long save(Company company);
}
