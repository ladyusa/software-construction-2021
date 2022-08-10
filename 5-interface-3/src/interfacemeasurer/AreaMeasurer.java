package interfacemeasurer;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer {
    @Override
    public double measure(Object object) {
        Rectangle rectangle = (Rectangle) object;
        double area = rectangle.getWidth() * rectangle.getHeight();
        return area;
    }
}
