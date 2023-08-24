package weather.hueather.weatherinfoept.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import weather.hueather.weatherinfoept.model.WeatherData;
import weather.hueather.weatherinfoept.service.WeatherService;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String getWeather(Model model) {
        model.addAttribute("weatherData", weatherService.getWeatherData());
        return "Weather";
    }

}
