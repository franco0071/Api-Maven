/*Dado un objeto LocalDate ingresado por el usuario, obtener el día de la semana luego de 
restar 13 días, 10 meses y  1 año. */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaSemana2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una fecha en formato yyyy-MM-dd: ");
        String fechaString = scanner.nextLine();

        LocalDate fechaUsuario = LocalDate.parse(fechaString);

        LocalDate fechaCalculada = fechaUsuario.plusDays(13).plusMonths(10).plusYears(1);
        DayOfWeek diaSemana = fechaCalculada.getDayOfWeek();

        System.out.println("Fecha calculada: " + fechaCalculada);
        System.out.println("Día de la semana: " + diaSemana);

        scanner.close();
    }
}
