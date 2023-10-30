package apps.edu.ucu.flowerstore.filters;

import java.util.Optional;

import apps.edu.ucu.flowerstore.Item;
import apps.edu.ucu.flowerstore.flowers.Flower;
import apps.edu.ucu.flowerstore.flowers.FlowerColor;
import apps.edu.ucu.flowerstore.flowers.FlowerType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class FlowerFilter implements Filter {
    private Optional<FlowerType> flowerType = Optional.empty();
    public void setFlowerType(FlowerType type) {
        this.flowerType = Optional.of(type);
    }

    public void clearFlowerType() { this.flowerType = Optional.empty(); }

    private Optional<FlowerColor> color = Optional.empty();

    public void setColor(FlowerColor col) { this.color = Optional.of(col); }

    public void clearColor() { this.color = Optional.empty(); }

    private Optional<Double> minPrice = Optional.empty();

    public void setMinPrice(double price) {
        this.minPrice = Optional.of(price);
    }

    public void clearMinPrice() { this.minPrice = Optional.empty(); }

    private Optional<Double> maxPrice = Optional.empty();

    public void setMaxrice(double price) { this.maxPrice = Optional.of(price); }

    public void clearMaxPrice() { this.maxPrice = Optional.empty(); }

    // METERS, BABY
    private Optional<Double> sepalLength = Optional.empty();

    public void setLen(double len) { this.sepalLength = Optional.of(len); }

    public void clearLen() { this.sepalLength = Optional.empty(); }

    public FlowerFilter(Flower flower) {
        this.flowerType = Optional.of(flower.getType());
        this.color = Optional.of(flower.getColorEnum());
        this.sepalLength = Optional.of(flower.getSepalLength());
    }

    public boolean match(Item item) {
        if (Flower.class != item.getClass()) {
            return false;
        }
        Flower flower = (Flower) item;
        return (this.flowerType.orElse(flower.getFlowerType()) ==
                flower.getFlowerType()) &&
            (this.color.orElse(flower.getColorEnum()) == flower.getColorEnum()) &&
            (this.minPrice.orElse(flower.getPrice()) <= flower.getPrice()) &&
            (this.maxPrice.orElse(flower.getPrice()) >= flower.getPrice()) &&
            (this.sepalLength.orElse(flower.getSepalLength()) <=
             flower.getSepalLength());
    }
}
