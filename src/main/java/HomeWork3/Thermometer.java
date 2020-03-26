package HomeWork3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Thermometer implements Converter {

    public void CelsiusConverter(double grade) {
        System.out.println(grade+"C");
    }

    public void KelvinConverter(double grade) {
        double CelsiusToKelvin = grade + 273.15;
        System.out.println("Converted grade from celsius to Kelvin is   " + CelsiusToKelvin + " K");
    }

    public void FahrenheitConverter(double grade) {
        double CelsiusToFahrenheit  = (grade * 1.8) + 32;
        System.out.println("Converted grade from celsius to Fahrenheit is " + CelsiusToFahrenheit + " F");
    }

    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please input your Celsius Grade");
        double grade = scanner.nextDouble();

        thermometer.CelsiusConverter(grade);
        thermometer.FahrenheitConverter(grade);
        thermometer.KelvinConverter(grade);
    }

}
