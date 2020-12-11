package referential.dao;

import org.springframework.data.repository.CrudRepository;
import referential.entities.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

    List<Customer> findAllByActiveIsTrue();
}
