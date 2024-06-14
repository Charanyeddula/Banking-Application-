package yeddula.assign1.salebin;

import yeddula.assign1.money.USMoney;

public class SmartBin extends Bin{
    private String label;

    //Constructor to initialize variables
    public SmartBin()
    {
        binNumber = "SM" + generateBinNumber();
        label = " ";
    }

    //Set function to initialize the string variable
    public void setLabel(String label)
    {
        this.label = label;
    }

    //Function to add items and check for fragility
    public void addItem(ItemType item)
    {
        if(item.getWeight() + getWeight() <= maxWeight) {
            items[itemCount++] = item;
            if(item.isFragile())
            {
                this.label = "Fragile - Handle with Care";
            }
        }
    }

    //Returns the total price of the items
    public USMoney calculatePrice()
    {
        USMoney totalPrice = new USMoney(100,0);
        for(ItemType item : this.items)
        {
            if(item != null)
            {
                totalPrice.addTo(item.getPrice().getDollars(), item.getPrice().getCents());
                if(item.isFragile())
                {
                    totalPrice.addTo(10,0);
                }
            }
        }
        return totalPrice;
    }

    //Returns the details of the items in form of a string
    public String showDetails()
    {
        String info = "Bin Number: "+this.binNumber+ " Label: "+ this.label+ "\nItems: " + this.itemCount+"\n";
        for(ItemType item : this.items)
        {
            if(item != null)
            {
                info += item.getDetails()+ "\n" + item.getWeight() + "\n" +item.getPrice()+ "\n";
            }
        }
        info += "Total weight: "+ getWeight()+ " \nTotal Price: "+ calculatePrice().toString();
        return info;
    }


}
