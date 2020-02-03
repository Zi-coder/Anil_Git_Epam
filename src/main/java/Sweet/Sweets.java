package Sweet;

public class Sweets extends Sweet {
    String confectionary;
    public Sweets(String name,int sweetness,int weight,double rating,String baker){
        this.sweetName = name;
        this.rating = rating;
        this.sweetness = sweetness;
        this.confectionary = baker;
        this.weightPerPack = weight;
    }
}
