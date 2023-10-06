package flower.filters;

import flower.flowers.Flower;
import flower.flowers.FlowerColor;
import flower.flowers.FlowerType;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FlowerFilter implements Filter {
    private Optional<FlowerType> flowerType = Optional<>.empty();

    public void setFlowerType(FlowerType type) {
        this.flowerType = Optional.of(type);
    }

    public void clearFlowerType() { this.flowerType = Optional<>.empty(); }

    private Optional<FlowerColor> color = Optional<>.empty();

    public void setColor(FlowerColor col) { this.color = Optional.of(col); }

    public void clearColor() { this.color = Optional<>.empty(); }

    private Optional<double> minPrice = Optional<>.empty();

    public void setMinPrice(double price) {
        this.minPrice = Optional.of(price);
    }

    public void clearMinPrice() { this.minPrice = Optional<>.empty(); }

    private Optional<double> maxPrice = Optional<>.empty();

    public void setMaxrice(double price) { this.maxPrice = Optional.of(price); }

    public void clearMaxPrice() { this.maxPrice = Optional<>.empty(); }

    // METERS, BABY
    private Optional<double> sepalLength = Optional<>.empty();

    public void setLen(doubel len) { this.sepalLength = Optional.of(len); }

    public void clearLen() { this.sepalLength = Optional<>.empty(); }

    public FlowerFilter(Flower flower) {
        this.flowerType = Optional.of(flower.flowerType);
        this.color = Optional.of(flower.color);
        this.price = Optional.of(flower.price);
        this.sepalLength = Optional.of(flower.sepalLength);
    }

    @Override
    public boolean match(Flower flower) {
        return (this.flowerType.orElse(flower.getFlowerType()) ==
                flower.getFlowerType()) &&
            (this.color.orElse(flower.getColor()) == flower.getColor()) &&
            (this.minPrice.orElse(flower.getPrice()) <= flower.getPrice()) &&
            (this.maxPrice.orElse(flower.getPrice()) >= flower.getPrice()) &&
            (this.sepalLength.orElse(flower.getSepalLength()) <=
             flower.getSepalLength())
    }
}
