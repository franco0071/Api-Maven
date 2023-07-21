/*Dado un objeto LocalDate ingresado por el usuario, verificar si el año es un año bisiesto */

import java.time.LocalDate;
import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una fecha en formato yyyy-MM-dd: ");
        String fechaString = scanner.nextLine();

        LocalDate fechaUsuario = LocalDate.parse(fechaString);

        int year = fechaUsuario.getYear();
        boolean esBisiesto = esAnioBisiesto(year);

        System.out.println("El año " + year + " es un año bisiesto? " + esBisiesto);

        scanner.close();
    }

    public static boolean esAnioBisiesto(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
