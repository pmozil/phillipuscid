package apps.edu.ucu.flowerstore.decorators;

import apps.edu.ucu.flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }
    
    @Override
    public double getPrice() {
        return  40 + item.getPrice();
    }
    
    @Override
    public String getDescription() {
        return "This item has a ribbon";
    }
}