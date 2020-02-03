package Sweet;

public abstract class Sweet implements Comparable<Sweet>{
    String sweetName;
    int sweetness;
    double rating;
    int weightPerPack;

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getWeightPerPack() {
        return weightPerPack;
    }

    public void setWeightPerPack(int weightPerPack) {
        this.weightPerPack = weightPerPack;
    }

    public int compareTo(Sweet o) {
        return this.getWeightPerPack()-o.getWeightPerPack();
    }
}
