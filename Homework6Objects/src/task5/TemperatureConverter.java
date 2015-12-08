package task5;

public class TemperatureConverter {
	public float convertToCelsius(float fahrenheit) {
		return (fahrenheit - 32) / 1.8f;
	}
	
	public float toFahrenheit(float celsius) {
		return celsius * 1.8f + 32;
	}
}
