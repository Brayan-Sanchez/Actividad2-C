import java.io.PrintStream;
import java.util.Scanner;
public class ejer51 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
         String numRom = "";
        String numRomTemp = "";
        int numArab = 0;

        System.out.println("Ingrese un número romano entre I(1) y MMMCMXCX (3999)");
        Scanner keyboard = new Scanner(System.in);
        numRom = keyboard.nextLine().trim().toUpperCase();
        numRomTemp = numRom;

        if(numRomTemp.startsWith("MMM")){
            numArab += 3000;
            numRomTemp = numRomTemp.substring(3);
        }
        else if (numRomTemp.startsWith("MM")){
            numArab += 2000;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("M")){
            numArab +=1000;
            numRomTemp = numRomTemp.substring(1);
        }

        if(numRomTemp.startsWith("CM")){
            numArab += 900;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("D")){
            numArab += 500;
            numRomTemp = numRomTemp.substring(1);
        }
        else if (numRomTemp.startsWith("CD")){
            numArab += 400;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("C")){
            numArab += 100;
            numRomTemp = numRomTemp.substring(1);
        }

        if(numRomTemp.startsWith("XC")){
            numArab += 90;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("L")){
            numArab += 50;
            numRomTemp = numRomTemp.substring(1);
        }
        else if (numRomTemp.startsWith("XL")){
            numArab += 40;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("X")){
            numArab += 10;
            numRomTemp = numRomTemp.substring(1);
        }

        if(numRomTemp.startsWith("IX")){
            numArab += 9;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("V")){
            numArab += 5;
            numRomTemp = numRomTemp.substring(1);
        }
        else if (numRomTemp.startsWith("IV")){
            numArab += 4;
            numRomTemp = numRomTemp.substring(2);
        }
        else if (numRomTemp.startsWith("I")){
            numArab += 1;
            numRomTemp = numRomTemp.substring(1);
        }

        System.out.println("El número arábigo es: " + numArab);
    }
}