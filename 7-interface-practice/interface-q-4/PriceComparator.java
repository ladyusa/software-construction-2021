package review.interface4;

import java.util.Comparator;

public class PriceComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Product product1 = (Product) o1;
        Product product2 = (Product) o2;
        if (product1.getPrice() < product2.getPrice()) return -1;
        if (product1.getPrice() > product2.getPrice()) return 1;
        return 0;
    }
}
