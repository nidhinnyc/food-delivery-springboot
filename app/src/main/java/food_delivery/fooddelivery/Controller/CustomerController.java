package food_delivery.fooddelivery.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import food_delivery.fooddelivery.Repository.CustomerRepository;
import food_delivery.fooddelivery.entity.Customer;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestParam String name, @RequestParam String email, Model model) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customerRepository.save(customer);

        return "redirect:/?message=Customer added successfully";
    }
}
