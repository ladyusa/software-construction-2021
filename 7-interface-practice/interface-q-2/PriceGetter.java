package review.interface2;

public class PriceGetter implements ValueGetter {
    @Override
    public double getValue(Object data) {
        Product product = (Product) data;
        return product.getPrice();
    }
}
