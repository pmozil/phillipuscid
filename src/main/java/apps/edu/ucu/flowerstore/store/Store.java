package apps.edu.ucu.flowerstore.store;

import java.util.ArrayList;
import java.util.List;

import apps.edu.ucu.flowerstore.Item;


public class Store {
    private List<Item> items = new ArrayList<>();
    
    public List<Item> search(Filter filter) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (filter.match(item)) {
                result.add(item);
            }
        }
        
        return result;
    }
}
