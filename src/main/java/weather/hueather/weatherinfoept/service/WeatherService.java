package weather.hueather.weatherinfoept.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.hueather.weatherinfoept.model.WeatherData;

@Service
public class WeatherService {

    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=Moscow,RU&appid=3b5bec5e752f4bbc3e4a53dd019a7cda&units=metric";

    public WeatherData getWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, WeatherData.class);
    }


}
