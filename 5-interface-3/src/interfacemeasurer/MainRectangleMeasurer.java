package interfacemeasurer;

import java.awt.*;

public class MainRectangleMeasurer {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 10);
        Rectangle rectangle3 = new Rectangle(20, 20);

        Rectangle[] rectangles = { rectangle1, rectangle2, rectangle3 };

        AreaMeasurer areaMeasurer = new AreaMeasurer();
        double areaAvg = Data.average(rectangles, areaMeasurer);
        System.out.println("Average area = " + areaAvg);

        double widthAvg = Data.average(rectangles, new WidthMeasurer());
        System.out.println("Average width = " + widthAvg);

        // inner class / trivial class
        class HeightMeasurer implements Measurer {

            @Override
            public double measure(Object object) {
                Rectangle rectangle = (Rectangle) object;
                return rectangle.getHeight();
            }
        }

        double heightAvg = Data.average(rectangles, new HeightMeasurer());
        System.out.println("Average height = " + heightAvg);

                                                       // anonymous class
        double perimeterAvg = Data.average(rectangles, new Measurer() {
            @Override
            public double measure(Object object) {
                Rectangle rectangle = (Rectangle) object;
                return 2 * (rectangle.getWidth() + rectangle.getHeight());
            }
        });
        System.out.println("Average perimeter = " + perimeterAvg);
    }

}
