package yeddula.assign1.salebin;

import yeddula.assign1.money.USMoney;
public interface ItemType {

    //Returns a boolean value indicating if the item is fragile or not
    boolean isFragile();

    //Returns the item's price as an instance of USMoney
    USMoney getPrice();

    //Returns the item's weight as a double
    double getWeight();

    //Returns a string with more information about the item.
    String getDetails();

}
