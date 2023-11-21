package food_delivery.fooddelivery.Controller;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// ...
@RestController
public class HomeController{
    @GetMapping("/home")
    public ResponseEntity<Resource> home() throws IOException {
        Resource resource = new ClassPathResource("templates/homepage.html");
        return ResponseEntity.ok()
            .contentType(MediaType.TEXT_HTML)
            .body(resource);
}
}