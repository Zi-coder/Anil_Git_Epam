package GIft;

import Sweet.Sweet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Gift  {
    List<Sweet> gift= new ArrayList<Sweet>();


    public int getTotalWeight(){
        int weight = 0;
        Iterator itr = gift.iterator();
        while(itr.hasNext()){
            Sweet sw = (Sweet) itr.next();
            weight += sw.getWeightPerPack();
        }
        return weight;
    }
    public void add(Sweet sweet){
        gift.add(sweet);
    }
    public void Sort(){
        Collections.sort(gift);
    }
    public void findCandy(){
        Iterator itr = gift.iterator();
        System.out.println("\nCandies are ");
        while(itr.hasNext()){
            Sweet sw = (Sweet)itr.next();

            if(sw.getClass().toString().equals("class Sweet.Candy"))
            System.out.print(sw.getSweetName() + " ");
        }
    }
    public void print(){
        System.out.println("\nContents of gift are :-");
        Iterator itr = gift.iterator();
        while (itr.hasNext()){
            Sweet sw = (Sweet)itr.next();
            System.out.print(sw.getSweetName() + " ");
        }
    }

}
