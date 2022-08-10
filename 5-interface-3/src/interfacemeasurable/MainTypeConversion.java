package interfacemeasurable;

import java.awt.*;

public class MainTypeConversion {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(200);
        account.getBalance();
        account.getMeasure();

        Country country = new Country("Thailand", 50);

        // static type --- type ทางซ้ายมือของการประกาศตัวแปร ref
        //                 static type จะไม่เปลี่ยนไปตลอดการทำงานของโปรแกรม
        // dynamic type --- type ของ object ที่ตัวแปร ref กำลังใช้งานอยู่
        //                  dynamic type จะเปลี่ยนไปตาม object ที่ ref กำลังใช้งาน
        Measurable meas = account;   // --- dynamic type เป็น BankAccount
        meas.getMeasure();   // ---> ใช้เวอร์ชันของ BankAccount คืนค่าเป็น balance

        meas = country;      // --- dynamic type เป็น Country
        meas.getMeasure();   // ---> ใช้เวอร์ชันของ Country คืนค่าเป็น area


    }
}
