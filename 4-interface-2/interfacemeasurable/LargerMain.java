package interfacemeasurable;

public class LargerMain {

    public static void main(String[] args) {
        Country uraguay = new Country("Uraguay", 176220);
        Country thailand = new Country("Thailand", 514000);

        Measurable max = Data.larger(uraguay, thailand);




//        String s           = max.getName();
        String countryName = ((Country) max).getName();

        Country maxCountry = (Country) max;

        String name = maxCountry.getName();
    }
}
