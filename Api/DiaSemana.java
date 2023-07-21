/*Dado un objeto LocalDate ingresado por el usuario, obtener el día de la semana  luego de añadir 
15 días, 2 meses y 3 años. */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una fecha en formato yyyy-MM-dd: ");
        String fechaString = scanner.nextLine();

        LocalDate fechaUsuario = LocalDate.parse(fechaString);

        LocalDate fechaCalculada = fechaUsuario.plusDays(15).plusMonths(2).plusYears(3);
        DayOfWeek diaSemana = fechaCalculada.getDayOfWeek();

        System.out.println("Fecha calculada: " + fechaCalculada);
        System.out.println("Día de la semana: " + diaSemana);

        scanner.close();
    }
}
