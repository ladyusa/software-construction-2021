package review.interface1;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
                new Product("Big Java", 500),
                new Product("Intro to CS", 400),
                new Product("Data Structure is Fun", 800)
        };
        System.out.println("max price = " +
                DataUtil.max(products));

        Car[] cars = {
                new Car("1", 49),
                new Car("2", 78),
                new Car("3", 55)
        };
        System.out.println("max kilo = " +
                DataUtil.max(cars));
    }
}
