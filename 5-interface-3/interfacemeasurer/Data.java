package interfacemeasurer;

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

    public static double average(Object[] objects, Measurer meas) {

        double sum = 0;

        for (Object obj : objects) {
            sum = sum + meas.measure(obj);  // polymorphism
        }

        if (objects.length > 0) return sum / objects.length;
        return 0;
    }


}
