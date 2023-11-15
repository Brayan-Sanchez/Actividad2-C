import java.io.PrintStream;
import java.util.Scanner;
public class ejer50 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        
        

        System.out.println("Ingrese la placa del automóvil:");
        String placa = keyboard.nextLine().trim();

        char lastDigit = placa.charAt(placa.length() - 1);

        System.out.println("Ingrese un día de la semana (ej: Lunes):");
        String weekday = keyboard.nextLine().trim();

        char weekDayChar = ' '; 

        if (weekday.equalsIgnoreCase("Lunes")) {
            weekDayChar = 'L';
        } else if (weekday.equalsIgnoreCase("Martes")) {
            weekDayChar = 'M';
        } else if (weekday.equalsIgnoreCase("Miércoles")) {
            weekDayChar = 'W';
        } else if (weekday.equalsIgnoreCase("Jueves")) {
            weekDayChar = 'J';
        } else if (weekday.equalsIgnoreCase("Viernes")) {
            weekDayChar = 'V';
        }
        if ((weekDayChar == 'L' && (lastDigit == '0' || lastDigit == '1')) ||
            (weekDayChar == 'M' && (lastDigit == '2' || lastDigit == '3')) ||
            (weekDayChar == 'W' && (lastDigit == '4' || lastDigit == '5')) ||
            (weekDayChar == 'J' && (lastDigit == '6' || lastDigit == '7')) ||
            (weekDayChar == 'V' && (lastDigit == '8' || lastDigit == '9'))) {
            System.out.println("El automóvil con la placa " + placa + " tiene restricciones de 'Pico y Placa' el día " + weekday + ".");
        } else {
            System.out.println("El automóvil con la placa " + placa + " no tiene restricciones de 'Pico y Placa' el día " + weekday + ".");
        }
    }
}
