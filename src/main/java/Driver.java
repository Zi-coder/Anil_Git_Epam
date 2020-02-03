import GIft.Gift;
import Sweet.*;

public class Driver {


    public static void main(String[] args) {
       Sweet dairyMilk = new Chocolate("DairyMilk",8,100,9.5,"Parle");
       Sweet VanilaCake = new Sweets("VanilaCake",6,150,7,"Baskin");
       Sweet mango = new Candy("MangoCandy",5,50,8,"Santa");
       Sweet mixFruit = new Candy("MixFruit",8,50,5,"Banta");
        Gift gift1 = new Gift();
        gift1.add(dairyMilk);
        gift1.add(VanilaCake);
        gift1.add(mango);
        gift1.add(mixFruit);

        System.out.println("Total Weight Of Gift = " + gift1.getTotalWeight());
        gift1.findCandy();
        gift1.print();
        gift1.Sort();
        gift1.print();


    }
}
