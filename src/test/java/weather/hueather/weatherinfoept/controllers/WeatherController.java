package weather.hueather.weatherinfoept.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.hueather.weatherinfoept.model.WeatherData;
import weather.hueather.weatherinfoept.service.WeatherService;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherData getWeather() {
        return weatherService.getWeatherData();
    }

}
