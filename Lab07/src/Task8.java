import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temp in Celsius ");
        double celsiusTemperature = scanner.nextDouble();
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", celsiusTemperature, fahrenheitTemperature);
    }
}
