package apps.edu.ucu.flowerstore;

import java.util.ArrayList;
import java.util.List;

public class Order<Thing extends Item> {
    private List<Thing> items = new ArrayList<>();
    
    void add(Thing newPack) {
        items.add(newPack);
    }
    
    public double getPrice() {
        double price = 0;
        for (Thing pack : items) {
            price += pack.getPrice();
        }
        
        return price;
    }
}
