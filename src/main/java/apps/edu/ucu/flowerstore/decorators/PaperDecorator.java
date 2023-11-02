package apps.edu.ucu.flowerstore.decorators;

import apps.edu.ucu.flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }
    
    @Override
    public double getPrice() {
        return  13 + item.getPrice();
    }
    
    @Override
    public String getDescription() {
        return "This item has paper";
    }
}
