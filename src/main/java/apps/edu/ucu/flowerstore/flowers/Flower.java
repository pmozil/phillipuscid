package apps.edu.ucu.flowerstore.flowers;

import apps.edu.ucu.flowerstore.Item;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @AllArgsConstructor @NoArgsConstructor @Entity
public class Flower extends Item {
    @Getter
    private FlowerType flowerType = FlowerType.ROSE;
    private FlowerColor color = FlowerColor.RED;
    private double price = 1.50;
    // METERS, BABY
    @Getter
    private double sepalLength = 1.20;
    
    @Override
    public double getPrice() {
        return price;
    }
    
    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return color.toString();
    }
    
    public boolean equals(Flower other) {
        if (this == other) {
            return true;
        }
        
        return this.flowerType == other.flowerType && this.color == other.color && this.price == other.price && this.sepalLength == other.sepalLength;
    }
}
