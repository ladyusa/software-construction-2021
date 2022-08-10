package generic;

import interfacemeasurable.Measurable;

public class Data {

    public static double average(Measurable[] objects) {

        double sum = 0;

        for (Measurable obj : objects) {
            sum = sum + obj.getMeasure();  // polymorphism
        }

        if (objects.length > 0) return sum / objects.length;
        return 0;
    }

    public static <T> double average(T[] objects, Measurer<T> meas) {

        double sum = 0;

        for (T obj : objects) {
            sum = sum + meas.measure(obj);  // polymorphism
        }

        if (objects.length > 0) return sum / objects.length;
        return 0;
    }


}
