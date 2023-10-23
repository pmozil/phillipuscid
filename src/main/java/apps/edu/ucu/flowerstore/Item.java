package apps.edu.ucu.flowerstore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item {
    @Id
    @GeneratedValue
    protected Integer id;
    public abstract double getPrice();
}
