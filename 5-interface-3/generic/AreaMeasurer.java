package generic;

import java.awt.*;

public class AreaMeasurer implements Measurer<Rectangle> {
    @Override
    public double measure(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        return area;
    }
}
