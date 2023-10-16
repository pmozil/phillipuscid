package apps.edu.ucu.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    @Getter @Setter
    private Flower flower;
    @Getter
    private int quantity = 1;
    
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.setQuantity(quantity);
    }

    public FlowerPack(Flower flower) {
        this.flower = flower;
    }

    public double getPrice() {
        return ((double) quantity) * flower.getPrice();
    }
    
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity <= 0 ? 1 : newQuantity;
    }
}
