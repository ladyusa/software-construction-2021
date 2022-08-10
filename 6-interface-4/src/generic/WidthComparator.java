package generic;

import java.awt.*;
import java.util.Comparator;

public class WidthComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getWidth() < r2.getWidth()) return -1;
        if (r1.getWidth() > r2.getWidth()) return 1;
        return 0;
    }
}
