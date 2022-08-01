package cn.quitt;

/**
 * Fruit
 *
 * @author Quitt
 **/
public class Fruit {
    private String name;
    private double price;
    private double discount;

    private int weight;

    public Fruit() {
    }

    public Fruit(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discount = 1;
    }

    public Fruit(String name, double price, double discount, int weight) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
