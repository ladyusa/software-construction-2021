package interfacemeasurer;

import java.awt.Rectangle;

public class WidthMeasurer implements Measurer {
    @Override
    public double measure(Object object) {
        Rectangle rectangle = (Rectangle) object;
        return rectangle.getWidth();
    }
}
