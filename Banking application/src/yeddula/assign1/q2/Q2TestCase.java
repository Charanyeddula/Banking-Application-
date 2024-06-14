
package yeddula.assign1.q2;

import yeddula.assign1.money.USMoney;
import yeddula.assign1.salebin.Bin;
import yeddula.assign1.salebin.SaleItem;
import yeddula.assign1.salebin.SmartBin;


public class Q2TestCase {
    public static void main(String[] args) {
        SaleItem item1 = new SaleItem("Item1", new USMoney(10.34), 25.3, true);
        SaleItem item2 = new SaleItem("Item2", new USMoney(5.67), 95.8, false);
        SaleItem item3 = new SaleItem("Item3", new USMoney(20.83), 10.53, false);
        SaleItem item4 = new SaleItem("Item4", new USMoney(40.64), 30.3, true);
        SaleItem item5 = new SaleItem("Item5", new USMoney(34.94), 29.5, false);

        // b) Create an instance of a Bin.
        Bin bin = new Bin();

        // c) Add the instances of SaleItems from a) to the Bin instance in b). Make sure that you exceed the maximum weight of the bin.
        bin.addItem(item1);
        bin.addItem(item2);
        bin.addItem(item3);
        bin.addItem(item4);
        bin.addItem(item5);

        // d) Show details on the Bin instance in b)
        System.out.println("Details of Bin:");
        System.out.println(bin.showDetails());

        // e) Create at least 5 more instances of SaleItems with data of your choice. Make some of the items “fragile”.
        SaleItem item6 = new SaleItem("Item1", new USMoney(10.34), 25.3, true);
        SaleItem item7 = new SaleItem("Item2", new USMoney(5.67), 5.8, false);
        SaleItem item8 = new SaleItem("Item3", new USMoney(20.83), 10.53, false);
        SaleItem item9 = new SaleItem("Item4", new USMoney(40.64), 30.3, true);
        SaleItem item10 = new SaleItem("Item5", new USMoney(34.94), 29.5, false);

        // f) Create an instance of a SmartBin.
        SmartBin smartBin = new SmartBin();

        // g) Add the instances of SaleItems from d) to the Bin instance in b). Make sure that you exceed the maximum weight of the bin.
        smartBin.addItem(item6);
        smartBin.addItem(item7);
        smartBin.addItem(item8);
        smartBin.addItem(item9);
        smartBin.addItem(item10);

        // h) Show details on the Bin instance in f
        System.out.println("\nDetails of Smart Bin:");
        System.out.println(smartBin.showDetails());

        // i) Create an instance of a Bin as follows:
        Bin bin3 = new SmartBin();

        // j) Can you add fragile SaleItems to bin3?
        bin3.addItem(item7);
    }

}



