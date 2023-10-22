package apps.edu.ucu.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

import apps.edu.ucu.flowerstore.Item;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class FlowerBucket extends Item {
    private List<FlowerPack> items = new ArrayList<>();
    
    void add(FlowerPack newPack) {
        items.add(newPack);
    }
    
    public double getPrice() {
        double price = 0;
        for (FlowerPack pack : items) {
            price += pack.getPrice();
        }
        
        return price;
    }
    
}
