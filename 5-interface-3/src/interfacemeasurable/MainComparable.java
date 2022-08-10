package interfacemeasurable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainComparable {

    public static void main(String[] args) {

//        BankAccount account1 = new BankAccount(500);
//        BankAccount account2 = new BankAccount(90000);
//
//        if (account1.compareTo(account2) < 0)
//            System.out.println("Account 1 < account 2");
//
//        if (account1.compareTo(account2) > 0)
//            System.out.println("Account 1 > account 2");
//
//        if (account1.compareTo(account2) == 0)
//            System.out.println("Account 1 == account 2");


//        ArrayList<BankAccount> arrayList = new ArrayList<>();
//        arrayList.add(new BankAccount(80));
//        arrayList.add(new BankAccount(40));
//        arrayList.add(new BankAccount(100));
//
//        for (BankAccount account : arrayList)
//            System.out.println(account);
//        System.out.println("---------------");
//
//        Collections.sort(arrayList);
//        for (BankAccount account : arrayList)
//            System.out.println(account);

        Country[] countries ={
                new Country("UK", 60),
                new Country("Thailand", 50),
                new Country("Mexico", 80) };


        for (Country country : countries)
            System.out.println(country);

        System.out.println("------- after sort name --------");
        Arrays.sort(countries);

        for (Country country : countries)
            System.out.println(country);
    }
}

















