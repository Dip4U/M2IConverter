package com.conversion.Metric2Imperial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.Metric2Imperial.Service.Metric2ImperialService;

@CrossOrigin
@RestController
public class Metric2ImperialController {
	
	@Autowired
	Metric2ImperialService metric2imperialService;
	
	@RequestMapping("/temperature/")
	public String temperateConverter(@RequestParam(name="to") String to,
			@RequestParam(name="from") String from,@RequestParam(name="value") double value)
			{
				if(to.equalsIgnoreCase("Celsius") && from.equalsIgnoreCase("Farenheit"))
		return metric2imperialService.getFarenheit2Celsius(value)+" ";
				else if(to.equalsIgnoreCase("Farenheit") && from.equalsIgnoreCase("Celsius"))
					return metric2imperialService.getCelsius2Farenheit(value)+" ";
				else if(to.equalsIgnoreCase("Kelvin") && from.equalsIgnoreCase("Celsius"))
					return metric2imperialService.getCelsius2Kelvin(value)+" ";
				else if(to.equalsIgnoreCase("Celsius") && from.equalsIgnoreCase("kelvin"))
					return metric2imperialService.getKelvin2Celsius(value)+" ";
				else if(to.equalsIgnoreCase("Farenheit") && from.equalsIgnoreCase("kelvin"))
					return metric2imperialService.getCelsius2Farenheit(metric2imperialService.getKelvin2Celsius(value))+" ";
				else if(to.equalsIgnoreCase("Kelvin") && from.equalsIgnoreCase("farenheit"))
					return metric2imperialService.getCelsius2Kelvin(metric2imperialService.getFarenheit2Celsius(value))+" ";
				else
					return "";
			}
	@RequestMapping("/length/")
	public String lengthConverter(@RequestParam(name="to") String to,
			@RequestParam(name="from") String from,@RequestParam(name="value") double value)
			{
		return metric2imperialService.getLengthConverter(to,from,value)+" ";

			}
	@RequestMapping("/area/")
	public String areaConverter(@RequestParam(name="to") String to,
			@RequestParam(name="from") String from,@RequestParam(name="value") double value)
			{
		return metric2imperialService.getAreaConverter(to,from,value)+" ";
			}
	@RequestMapping("/mass/")
	public String weightConverter(@RequestParam(name="to") String to,
			@RequestParam(name="from") String from,@RequestParam(name="value") double value)
			{
		return metric2imperialService.getWeightConverter(to,from,value)+" ";
			}
	@RequestMapping("/volume/")
	public String volumeConverter(@RequestParam(name="to") String to,
			@RequestParam(name="from") String from,@RequestParam(name="value") double value)
			{
		return metric2imperialService.getVolumeConverter(to,from,value)+" ";
			}
}
