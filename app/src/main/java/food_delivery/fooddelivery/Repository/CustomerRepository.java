package food_delivery.fooddelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food_delivery.fooddelivery.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
