/*Permitir a un usuario ingresar por separado dia , mes y año para crear un LocalDate */

import java.time.LocalDate;
import java.util.Scanner;

public class FechaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día en formato DD: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa el mes en formato MM: ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año en formto YYYY: ");
        int año = scanner.nextInt();

        LocalDate fechaUsuario = LocalDate.of(año, mes, dia);
        System.out.println("La fecha ingresada es: " + fechaUsuario);

        scanner.close();
    }
}
