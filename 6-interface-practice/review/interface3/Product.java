package review.interface3;

public class Product implements Comparable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        Product other = (Product) o;
        if (this.price < other.price) return -1;
        if (this.price > other.price) return 1;
        return 0;
    }
}
