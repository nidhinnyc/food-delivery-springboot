package food_delivery.fooddelivery.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private List<MenuItem> menu;

    public Restaurant() {
    }


    public Restaurant(String name, List<MenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }


    public Restaurant(Long id, String name, List<MenuItem> menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<MenuItem> getMenu() {
        return menu;
    }


    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }


    @Override
    public String toString() {
        return "Restaurant [id=" + id + ", name=" + name + ", menu=" + menu + "]";
    }
    
    


}

