package flower.filters;

import flower.Item;

public interface Filter {
    boolean match(Item item);
    
}
