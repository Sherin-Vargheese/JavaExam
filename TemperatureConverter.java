import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {       //Celsius to Fahrenheit conversion
        return celsius * ((double) 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {    //Fahrenheit to Celsius conversion
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double celToFah = celsiusToFahrenheit(celsius);
                    System.out.println(String.format("%.1f", celsius) + "°C = "
                            + String.format("%.1f", celToFah) + "°F");
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double fahToCel = fahrenheitToCelsius(fahrenheit);
                    System.out.println(String.format("%.1f", fahrenheit) + "°F = "
                            + String.format("%.1f", fahToCel) + "°C");
                    break;
                case 3:
                    System.out.print("Exit...");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}