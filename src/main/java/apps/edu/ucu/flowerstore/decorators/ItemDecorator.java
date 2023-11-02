package apps.edu.ucu.flowerstore.decorators;

import apps.edu.ucu.flowerstore.Item;

abstract class ItemDecorator extends Item {
    abstract public String getDescription();
}