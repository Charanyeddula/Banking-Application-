package yeddula.assign1.salebin;

import yeddula.assign1.money.USMoney;
public class SaleItem implements ItemType {

    private String itemName;
    private USMoney price;
    private double weight;
    private boolean fragile;

    public SaleItem(String itemName, USMoney price, double weight, boolean fragile)
    {
        this.itemName = itemName;
        this.price = price;
        this.weight = weight;
        this.fragile = fragile;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    //Returns the value of the fragile instance variable.
    @Override
    public boolean isFragile() {
        return this.fragile;
    }

    //Initializes the value of the price instance variable.
    public void setFragile(boolean fragile)
    {
        this.fragile = fragile;
    }

    //Returns the value of the weight instance variable.
    @Override
    public USMoney getPrice() {
        return price;
    }

    //Returns a string composed of the item name and price.
    public void setPrice(USMoney price)
    {
        this.price = price;
    }

    //Returns the value of the weight of the item
    @Override
    public double getWeight() {
        return weight;
    }

    //Initializes the value of weight of the item
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //Returns the values of the details in form of a string
    @Override
    public String getDetails() {
        return itemName+" "+price;
    }
}
