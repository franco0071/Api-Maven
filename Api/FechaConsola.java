/*Permitir a un usuario ingresar en un formato predefinido por ti la fecha por consola para
 crear un LocalDate */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FechaConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la fecha en formato dd/MM/yyyy (debe por el simbolo / luego de cada fecha): ");
        String fechaString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);

        System.out.println("Fecha ingresada: " + fecha);

        scanner.close();
    }
}
