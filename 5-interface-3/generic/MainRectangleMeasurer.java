package generic;

import interfacemeasurable.BankAccount;

import java.awt.*;

public class MainRectangleMeasurer {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 10);
        Rectangle rectangle3 = new Rectangle(20, 20);

        Rectangle[] rectangles = { rectangle1, rectangle2, rectangle3 };
        BankAccount[] bankAccounts = { new BankAccount(100), new BankAccount(200)};

        AreaMeasurer areaMeasurer = new AreaMeasurer();
        double areaAvg = Data.average(rectangles, areaMeasurer);
//        double areaAvg = Data.average(bankAccounts, areaMeasurer); ---> syntax error
        System.out.println("Average area = " + areaAvg);

        double widthAvg = Data.average(rectangles, new WidthMeasurer());
        System.out.println("Average width = " + widthAvg);

        // inner class / trivial class
        class HeightMeasurer implements Measurer<Rectangle> {

            @Override
            public double measure(Rectangle rectangle) {
                return rectangle.getHeight();
            }
        }

        double heightAvg = Data.average(rectangles, new HeightMeasurer());
        System.out.println("Average height = " + heightAvg);

                                                       // anonymous class
        double perimeterAvg = Data.average(rectangles, new Measurer<Rectangle>() {
            @Override
            public double measure(Rectangle rectangle) {
                return 2 * (rectangle.getWidth() + rectangle.getHeight());
            }
        });
        System.out.println("Average perimeter = " + perimeterAvg);
    }

}
