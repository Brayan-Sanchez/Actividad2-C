import java.io.PrintStream;
import java.util.Scanner;

public class ejer53 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa un número romano entre I y MMMCMXCIX:");
        String numeroRomano = keyboard.nextLine();
        int valorDecimal = romanoADecimal(numeroRomano);
        System.out.println("El valor decimal del número romano " + numeroRomano + " es: " + valorDecimal);
    }

    public static int romanoADecimal(String numeroRomano) {
        int valorDecimal = 0;
        int ultimoNumero = 0;
        for (int i = numeroRomano.length() - 1; i >= 0; i--) {
            char caracterRomano = numeroRomano.charAt(i);
            switch (caracterRomano) {
                case 'I':
                case 'i':
                    valorDecimal = procesarDecimal(1, ultimoNumero, valorDecimal);
                    ultimoNumero = 1;
                    break;
                case 'V':
                case 'v':
                    valorDecimal = procesarDecimal(5, ultimoNumero, valorDecimal);
                    ultimoNumero = 5;
                    break;
                case 'X':
                case 'x':
                    valorDecimal = procesarDecimal(10, ultimoNumero, valorDecimal);
                    ultimoNumero = 10;
                    break;
                case 'L':
                case 'l':
                    valorDecimal = procesarDecimal(50, ultimoNumero, valorDecimal);
                    ultimoNumero = 50;
                    break;
                case 'C':
                case 'c':
                    valorDecimal = procesarDecimal(100, ultimoNumero, valorDecimal);
                    ultimoNumero = 100;
                    break;
                case 'D':
                case 'd':
                    valorDecimal = procesarDecimal(500, ultimoNumero, valorDecimal);
                    ultimoNumero = 500;
                    break;
                case 'M':
                case 'm':
                    valorDecimal = procesarDecimal(1000, ultimoNumero, valorDecimal);
                    ultimoNumero = 1000;
                    break;
            }
        }
        return valorDecimal;
    }

    public static int procesarDecimal(int decimal, int ultimoNumero, int ultimoDecimal) {
        if (ultimoNumero > decimal) {
            return ultimoDecimal - decimal;
        } else {
            return ultimoDecimal + decimal;
        }
    }
}

   