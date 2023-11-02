package apps.edu.ucu.flowerstore.decorators;

import apps.edu.ucu.flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }
    
    @Override
    public double getPrice() {
        return  4 + item.getPrice();
    }
    
    @Override
    public String getDescription() {
        return "This item has a basket";
    }
}
