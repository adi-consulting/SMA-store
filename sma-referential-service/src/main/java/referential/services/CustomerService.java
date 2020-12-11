package referential.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import referential.dao.CustomerRepository;
import referential.entities.Customer;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(Long id){
        return customerRepository.findById(id).get();
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    public List<Customer> findAllByActiveIsTrue(){
        return customerRepository.findAllByActiveIsTrue();
    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
