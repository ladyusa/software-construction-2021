package review.interface2;

public class DataUtil {

    public static double max(Object[] dataSet, ValueGetter getter) {
        double max = -1;
        for (Object data : dataSet) {
            if (max < getter.getValue(data))
                max = getter.getValue(data);
        }
        return max;
    }
}
