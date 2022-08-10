package review.interface2;

public class KiloGetter implements ValueGetter {
    @Override
    public double getValue(Object data) {
        Car car = (Car) data;
        return car.getKiloDriven();
    }
}
