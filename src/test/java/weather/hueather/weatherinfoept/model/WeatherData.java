package weather.hueather.weatherinfoept.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Objects;

@Data
public class WeatherData {

    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    // Геттеры и сеттеры

    public static class Coord {
        private double lon;
        private double lat;

        // Геттеры и сеттеры
    }

    public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;

        // Геттеры и сеттеры
    }

    public static class Main {
        @JsonProperty("temp")
        private double temp;
        @JsonProperty("feels_like")
        private double feelsLike;
        @JsonProperty("temp_min")
        private double tempMin;
        @JsonProperty("temp_max")
        private double tempMax;
        @JsonProperty("pressure")
        private int pressure;
        @JsonProperty("humidity")
        private int humidity;
        @JsonProperty("sea_level")
        private int seaLevel;
        @JsonProperty("grnd_level")
        private int groundLevel;

        // Геттеры и сеттеры


        @Override
        public String toString() {
            return "Main{" +
                    "temp=" + temp +
                    ", feelsLike=" + feelsLike +
                    ", tempMin=" + tempMin +
                    ", tempMax=" + tempMax +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", seaLevel=" + seaLevel +
                    ", groundLevel=" + groundLevel +
                    '}';
        }
    }

    public static class Wind {
        private double speed;
        private int deg;
        private double gust;

        // Геттеры и сеттеры
    }

    public static class Clouds {
        private int all;

        // Геттеры и сеттеры
    }

    public static class Sys {
        private int type;
        private int id;
        private String country;
        private long sunrise;
        private long sunset;

        // Геттеры и сеттеры
    }
}
