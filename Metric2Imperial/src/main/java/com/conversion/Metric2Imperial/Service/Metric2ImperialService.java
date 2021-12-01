package com.conversion.Metric2Imperial.Service;

public interface Metric2ImperialService {

	double getKelvin2Celsius(double temp);

	double getCelsius2Kelvin(double temp);

	double getCelsius2Farenheit(double temp);

	double getFarenheit2Celsius(double temp);

	double getLengthConverter(String to, String from, double value);

	double getAreaConverter(String to, String from, double value);

	double getWeightConverter(String to, String from, double value);

	double getVolumeConverter(String to, String from, double value);

}
