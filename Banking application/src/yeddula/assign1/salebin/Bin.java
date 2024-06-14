package yeddula.assign1.salebin;

import yeddula.assign1.money.USMoney;

public class Bin implements BinType {

    protected static int binCounter = 0;
    protected String binNumber;
    protected final double maxWeight = 100;
    protected ItemType[] items;
    protected int itemCount;

    //Constructor to initialize the variables
    public Bin() {
        this.binNumber = "C" + generateBinNumber();
        this.items = new ItemType[10];
        itemCount= 0;
    }

    //Returns the maximum weight of the item
    public double getMaxWeight() {
        return maxWeight;
    }

    //Function to generate and iterate through the counter variable
    public int generateBinNumber()
    {
        return binCounter++;
    }

    //Function to add items to the array
    @Override
    public void addItem(ItemType item)
    {
        if(item.getWeight() + getWeight() <= maxWeight && !item.isFragile()){
            System.out.println(item.getWeight());
            items[itemCount++] = item;
        }
    }

    //Returns the total price of the items
    @Override
    public USMoney calculatePrice()
    {
        USMoney totalPrice = new USMoney(0,0);
        for(int i=0; i<itemCount; i++)
        {
            totalPrice = totalPrice.add(items[i].getPrice());
        }
        totalPrice = totalPrice.add(new USMoney(100,0));
        return totalPrice;
    }

    //Returns the total weight of the items in the array. Checks if the array is null at first
    @Override
    public double getWeight() {
        double totalWeight = 0;
        for(ItemType item : items)
        {
            if(item != null){
                totalWeight = totalWeight + item.getWeight();
            }
        }
        return totalWeight;
    }

    //Returns the number of items
    @Override
    public int getNoOfItems() {
        return itemCount;
    }

    //Returns the details in form of string
    @Override
    public String showDetails() {
        return binNumber+" "+getWeight()+" "+calculatePrice();
    }


}
