package sg.edu.rp.c346.demoweather;

public class Weather {

    private String Area;
    private String Forecast;

    public Weather(String Area, String Forecast) {
        this.Area = Area;
        this.Forecast = Forecast;
    }

    public String getArea() {
        return Area;
    }

    public String getForecast() {
        return Forecast;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setForecast(String Forecast) {
        this.Forecast = Forecast;
    }

    public String toString() {
        return Area+ ": " + Forecast ;
    }
}
