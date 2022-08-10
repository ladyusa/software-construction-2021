package review.interface1;

public class DataUtil {

    public static double max(Valuable[] valuables) {
        double max = -1;
        for (Valuable data : valuables) {
            if (max < data.getValue())
                max = data.getValue();
        }
        return max;
    }
}
