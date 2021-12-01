package com.conversion.Metric2Imperial.Service.Impl;

import org.springframework.stereotype.Service;

import com.conversion.Metric2Imperial.Service.Metric2ImperialService;

@Service
public class Metric2ImperialServiceImpl implements Metric2ImperialService {
	
	@Override
	public double getKelvin2Celsius(double temp)
	{
		
		return temp-273;
	}
	@Override
	public double getCelsius2Kelvin(double temp)
	{
		
		return temp+273;
	}
	@Override
	public double getCelsius2Farenheit(double temp)
	{
		
		return (1.8*temp)+32;
	}
	@Override
	public double getFarenheit2Celsius(double temp)
	{
		
		return (5*(temp-32)/9);
	}
	@Override
	public double getLengthConverter(String to, String from, double value) {
		// TODO Auto-generated method stub
		double prefix=1,suffix=1,multFact=1;
		if(from.equals("kilometer"))
			prefix=1000;
		else if(from.equals("centimeter"))
			prefix=0.01;
		else if(from.equals("millimeter"))
			prefix=0.001;
		else if(from.equals("inch"))
			prefix=0.0833;
		else if(from.equals("mile"))
			prefix=5280;
		else if(from.equals("yard"))
			prefix=3;
		if(to.equals("kilometer"))
			suffix=0.001;
		else if(to.equals("centimeter"))
			suffix=100;
		else if(to.equals("millimeter"))
			suffix=1000;
		else if(to.equals("inch"))
			suffix=12;
		else if(to.equals("mile"))
			suffix=0.000189394;
		else if(to.equals("yard"))
			suffix=0.333333;
		if(from.contains("meter"))
			return prefix*value*3.28084*suffix;
		else
			return prefix*value*0.3048*suffix;

	}
	@Override
	public double getAreaConverter(String to, String from, double value) {
		// TODO Auto-generated method stub
		double prefix=1,suffix=1,multFact=1;
		if(from.equals("square kilometer"))
			prefix=Math.pow(1000,2);
		if(from.equals("hectare"))
			prefix=10000;
		else if(from.equals("square centimeter"))
			prefix=Math.pow(0.01,2);
		else if(from.equals("square millimeter"))
			prefix=Math.pow(0.001,2);
		else if(from.equals("square inch"))
			prefix=Math.pow(0.0833,2);
		else if(from.equals("square mile"))
			prefix=Math.pow(5280,2);
		else if(from.equals("square yard"))
			prefix=Math.pow(3,2);
		else if(from.equals("acre"))
			prefix=43560;

		if(to.equals("square kilometer"))
			suffix=Math.pow(0.001,2);
		if(to.equals("hectare"))
			suffix=Math.pow(0.01,2);
		else if(to.equals("square centimeter"))
			suffix=Math.pow(100,2);
		else if(to.equals("square millimeter"))
			suffix=Math.pow(1000,2);
		else if(to.equals("square inch"))
			suffix=Math.pow(12,2);
		else if(to.equals("square mile"))
			suffix=Math.pow(0.000189394,2);
		else if(to.equals("square yard"))
			suffix=Math.pow(0.333333,2);
		else if(to.equals("acre"))
			suffix=2.29568411386E-5;
		if(from.contains("meter")||from.contains("hectare"))
			return prefix*value*Math.pow(3.28084,2)*suffix;
		else
			return prefix*value*Math.pow(0.3048,2)*suffix;
	}
	@Override
	public double getWeightConverter(String to, String from, double value) {
		// TODO Auto-generated method stub
		double prefix=1,suffix=1,multFact=1;
		if(from.equals("tonne"))
			prefix=1000;
		else if(from.equals("gram"))
			prefix=0.001;
		else if(from.equals("stone"))
			prefix=14;
		else if(from.equals("ounce"))
			prefix=0.0625;
		if(to.equals("tonne"))
			suffix=0.001;
		else if(to.equals("gram"))
			suffix=1000;
		else if(to.equals("stone"))
			suffix=0.0714286;
		else if(to.equals("ounce"))
			suffix=16;
		if(from.contains("gram")||from.contains("tonne"))
			return prefix*value*2.20462*suffix;
		else
			return prefix*value*0.453592*suffix;
	}
	@Override
	public double getVolumeConverter(String to, String from, double value) {
		// TODO Auto-generated method stub
		double prefix=1,suffix=1,multFact=1;
		if(from.equals("millilitre"))
			prefix=0.001;
		else if(from.equals("pint"))
			prefix=0.125;
		else if(from.equals("quart"))
			prefix=0.25;
		else if(from.equals("cup"))
			prefix=0.0625;
		if(to.equals("millilitre"))
			suffix=1000;
		else if(to.equals("pint"))
			suffix=8;
		else if(to.equals("quart"))
			suffix=4;
		else if(to.equals("cup"))
			suffix=16;
		if(from.contains("litre"))
			return prefix*value*0.219969*suffix;
		else
			return prefix*value*4.54609*suffix;
	}
}
