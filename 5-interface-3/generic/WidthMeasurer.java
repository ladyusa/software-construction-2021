package generic;

import java.awt.*;

public class WidthMeasurer implements Measurer<Rectangle> {
    @Override
    public double measure(Rectangle rectangle) {
        return rectangle.getWidth();
    }
}
