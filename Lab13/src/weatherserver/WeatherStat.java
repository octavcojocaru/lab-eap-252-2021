package weatherserver;

import java.io.Serializable;

public class WeatherStat implements Serializable {

    private String city;
    private String temperature;

    public WeatherStat(String city, String temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherStat{" +
                "city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
