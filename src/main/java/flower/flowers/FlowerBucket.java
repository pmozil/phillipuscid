package flower.flowers;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> flowers = new ArrayList<>();
    
    void add(FlowerPack newPack) {
        flowers.add(newPack);
    }
    
    public double getPrice() {
        double price = 0;
        for (FlowerPack pack : flowers) {
            price += pack.getPrice();
        }
        
        return price;
    }
    
}
