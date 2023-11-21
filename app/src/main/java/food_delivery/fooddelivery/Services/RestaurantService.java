package food_delivery.fooddelivery.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import food_delivery.fooddelivery.Repository.RestaurantRepository;

import food_delivery.fooddelivery.entity.Restaurant;
@Service
public class RestaurantService {
    @Autowired
    private final RestaurantRepository restaurantRepository;
    
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Iterable<Restaurant> getAllRestaurants(){
		return restaurantRepository.findAll();
	}
    
}
