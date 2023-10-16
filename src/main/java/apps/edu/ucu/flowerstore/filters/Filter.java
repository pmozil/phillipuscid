package apps.edu.ucu.flowerstore.filters;

import apps.edu.ucu.flowerstore.Item;

public interface Filter {
    boolean match(Item item);
}
