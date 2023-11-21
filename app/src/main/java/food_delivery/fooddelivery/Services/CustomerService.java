package food_delivery.fooddelivery.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import food_delivery.fooddelivery.Repository.CustomerRepository;
import food_delivery.fooddelivery.entity.Customer;
@Service
public class CustomerService {
	private final CustomerRepository customerRepository;
	
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
}
