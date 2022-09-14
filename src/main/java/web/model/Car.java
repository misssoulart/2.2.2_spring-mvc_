package web.model;

public class Car {

    private int series;
    private String country;
    private String model;

    public Car () {}

    public Car(int series, String country, String model) {
        this.series = series;
        this.country = country;
        this.model = model;
    }


    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
