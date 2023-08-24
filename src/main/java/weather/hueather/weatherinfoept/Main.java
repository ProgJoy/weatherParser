package weather.hueather.weatherinfoept;

import weather.hueather.weatherinfoept.service.WeatherService;

public class Main {

    public static void main(String[] args) {
        WeatherService d = new WeatherService();
        System.out.println(d.getWeatherData());

/*        WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Moscow,RU&appid=3b5bec5e752f4bbc3e4a53dd019a7cda&units=metric", WeatherData.class);
        System.out.println(weatherData);*/
    }
}
