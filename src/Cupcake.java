public class Cupcake {
    private String flavor;
    private float price;
    private int rating;

    public Cupcake(String flavor, float price, int rating) {
        this.flavor = flavor;
        this.price = price;
        this.rating = rating;
    }

    public String getFlavor() {
        return flavor;
    }

    public float getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
