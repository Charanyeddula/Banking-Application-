package yeddula.assign1.salebin;

import yeddula.assign1.money.USMoney;
public interface BinType {

    //Method adds an ItemType object to the collection
    public void addItem (ItemType item);

    //Method returns the total price of all the ItemType objects in the collection as an instance of USMoney.
    public USMoney calculatePrice();

    //Method returns the total weight of all the ItemType objects in the collection as a double.
    public double getWeight();

    //Method returns the number of ItemType objects in the collection as an int.
    public int getNoOfItems();

    //Method returns a string with details about all the ItemType objects in the collection.
    public String showDetails();
}
