package yeddula.assign1.money;

public class USMoney {

    //Data member 1
    private int dollars;

    //Data member 2
    private int cents;

    //Constructor with parameters
    public USMoney(int dollars, int cents)
    {
        this.dollars += dollars;
        if(cents<0)
            cents = 0;
        else if(cents>99) {
            this.dollars+= cents / 100;
            this.cents = cents % 100;
        }
        else{
            this.cents += cents;
        }
    }

    //Default constructor
    public USMoney()
    {
        this.dollars = 0;
        this.cents = 0;
    }

    public USMoney(double amount)
    {
        this.dollars = (int) amount;
        this.cents = (int)((amount-this.dollars) * 100 + 0.5);
    }

    //Getter function to return dollars variable
    public int getDollars()
    {
        return dollars;
    }

    //Getter function to return cents variable
    public int getCents()
    {
        return cents;
    }


    //Set function to initialize dollars variable
    public void setDollars(int dollars)
    {
        this.dollars = dollars;
    }

    //Set function to initialize cents variable
    public void setCents(int cents)
    {
        this.cents = cents;
    }

    //Function to add parameter values to the data members
    public void addTo(int dollars, int cents)
    {
        int Tcents = 0;
        this.dollars+= dollars;
        Tcents = cents + this.cents;
        if(Tcents > 99)
        {
            this.dollars += Tcents /100;
            this.cents = Tcents % 100;
        }
        else
            this.cents+= Tcents;
    }

    //Function creates and returns new USMoney object representing sum of objects
    public USMoney add(USMoney money)
    {
        int totalDollars = this.dollars + money.dollars;
        int totalCents = this.cents + money.cents;
        if(totalCents>=100)
        {
            totalDollars = totalDollars + totalCents / 100;
            totalCents = totalCents % 100;
        }
        return new USMoney(totalDollars, totalCents);
    }

    //Function returns the currency value in form of a string
    public String toString()
    {
        return "$" +dollars+"."+ String.format("%02d",cents);
    }
}