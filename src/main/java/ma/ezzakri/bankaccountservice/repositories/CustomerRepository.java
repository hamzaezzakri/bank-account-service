package ma.ezzakri.bankaccountservice.repositories;

import ma.ezzakri.bankaccountservice.entities.BankAccount;
import ma.ezzakri.bankaccountservice.entities.Customer;
import ma.ezzakri.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
