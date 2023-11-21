package food_delivery.fooddelivery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import food_delivery.fooddelivery.Services.RestaurantService;
import food_delivery.fooddelivery.entity.Restaurant;

@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;


    @GetMapping("/restaurants")
    public Iterable<Restaurant> showRestaurants(Model model) {
        // Retrieve all restaurants
        return restaurantService.getAllRestaurants();
    }

}
