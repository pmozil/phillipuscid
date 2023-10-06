package flower.store;

import flower.Item;
import flower.filters.Filter;
import java.util.ArrayList;
import java.util.List;


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
