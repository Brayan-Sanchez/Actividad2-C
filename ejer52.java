import java.util.Scanner;

public class ejer52 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nombreJugadora = new String[8];
        String[] ganadoras = new String[4];
        String ganadoraFinal;

        System.out.println("Ingresa el nombre de la jugadora con rango #1:");
        nombreJugadora[0] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #2:");
        nombreJugadora[1] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #3:");
        nombreJugadora[2] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #4:");
        nombreJugadora[3] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #5:");
        nombreJugadora[4] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #6:");
        nombreJugadora[5] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #7:");
        nombreJugadora[6] = keyboard.nextLine();
        System.out.println("Ingresa el nombre de la jugadora con rango #8:");
        nombreJugadora[7] = keyboard.nextLine();

        
        ganadoras[0] = jugarPartido(nombreJugadora[0], nombreJugadora[7], teclado);
        ganadoras[1] = jugarPartido(nombreJugadora[3], nombreJugadora[4], teclado);
        ganadoras[2] = jugarPartido(nombreJugadora[5], nombreJugadora[2], teclado);
        ganadoras[3] = jugarPartido(nombreJugadora[6], nombreJugadora[1], teclado);

       
        String semiFinalista1 = jugarPartido(ganadoras[0], ganadoras[1], teclado);
        String semiFinalista2 = jugarPartido(ganadoras[2], ganadoras[3], teclado);

        
        ganadoraFinal = jugarPartido(semiFinalista1, semiFinalista2, teclado);

        System.out.println("La campeona del torneo es: " + ganadoraFinal);
    }

    public static String jugarPartido(String jugadora1, String jugadora2, Scanner teclado) {
        System.out.println("Partido: " + jugadora1 + " vs. " + jugadora2);
        System.out.println("Ingresa el resultado (2-0, 2-1, 0-2, 1-2):");
        String resultado = keyboard.nextLine();
        if (resultado.equals("2-0") || resultado.equals("2-1")) {
            return jugadora1;
        } else {
            return jugadora2;
        }
    }
}

