package WishList;

public class Wishlist {
    private String name;
    private String description;
    private double price;
    private int ratio;

    public Wishlist(String name, String description, double price, int patio) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int patio) {
        this.ratio = patio;
    }

    @Override
    public String toString() {
        return
                "Название:" + name + '\'' +
                ", Описание:" + description + '\'' +
                ", Стоимость:" + price +
                ", Рейтинг:" + ratio ;
    }
}
