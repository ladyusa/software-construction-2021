package interfacemeasurer;

import interfacemeasurable.Country;

import java.util.Arrays;
import java.util.Comparator;

public class MainCountryComparator {

    public static void main(String[] args) {
        Country[] countries ={
                new Country("UK", 60, 100),
                new Country("Thailand", 50, 70),
                new Country("Mexico", 80, 90) };

        for (Country country : countries)
            System.out.println(country);

        System.out.println("--------- after sort by name ----- ");
        Arrays.sort(countries, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Country c1 = (Country) o1;
                Country c2 = (Country) o2;
                return c1.getName().compareTo(c2.getName());
            }
        });
        for (Country country : countries)
            System.out.println(country);

        System.out.println("--------- after sort by area ----- ");
        Arrays.sort(countries, new AreaComparator());
        for (Country country : countries)
            System.out.println(country);
    }

    static class AreaComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Country c1 = (Country) o1;
            Country c2 = (Country) o2;
            if (c1.getArea() < c2.getArea()) return -1;
            if (c1.getArea() > c2.getArea()) return 1;
            return 0;
        }
    }
}
