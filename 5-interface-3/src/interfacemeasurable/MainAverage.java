package interfacemeasurable;

public class MainAverage {

    public static void main(String[] args) {
        BankAccount[] bankAccounts =
                { new BankAccount(100), new BankAccount(200), new BankAccount(300) };

        double balanceAvg = Data.average(bankAccounts);
        System.out.println("Average Balance = " + balanceAvg);

        Country[] countries =
                { new Country("Thailand", 50), new Country("UK", 60),
                  new Country("Mexico", 80) };

        double areaAvg = Data.average(countries);
        System.out.println("Average Area = " + areaAvg);

    }
}
