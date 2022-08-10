package interfacemeasurable;

public class Country implements Measurable {
    private String name;
    private double area;
    private int population;
    private double gdp;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public double getMeasure() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }

}