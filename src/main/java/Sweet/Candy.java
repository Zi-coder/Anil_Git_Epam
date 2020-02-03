package Sweet;

public class Candy extends Sweet{
    String maker;
    public Candy(String name,int sweetness,int weight,double rating,String maker){
        this.sweetName = name;
        this.rating = rating;
        this.sweetness = sweetness;
        this.maker = maker;
        this.weightPerPack = weight;
    }
}
