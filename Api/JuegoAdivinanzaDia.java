/*Crear un juego de adivinanza de una fecha, donde crees una LocalDate aleatorio y le preguntes al 
usuario cuál es. Solo puedes decirle si la fecha ingresada es antes o después de la fecha objetivo. 
Cuando adivine la fecha termina el juego y lo felicitas por haberme logrado.*/

import java.time.LocalDate;
import java.util.Scanner;

public class JuegoAdivinanzaDia {
    public static void main(String[] args) {
        LocalDate fechaObjetivo = generarFechaAleatoria();
        System.out.println("¡Bienvenido al juego de adivinanza de fecha!");

        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;

        while (!adivinado) {
            System.out.print("Ingresa una fecha en formato yyyy-MM-dd: ");
            String fechaString = scanner.nextLine();
            LocalDate fechaIngresada = LocalDate.parse(fechaString);

            if (fechaIngresada.isBefore(fechaObjetivo)) {
                System.out.println("La fecha ingresada es antes de la fecha objetivo. ¡Sigue intentando!");
            } else if (fechaIngresada.isAfter(fechaObjetivo)) {
                System.out.println("La fecha ingresada es después de la fecha objetivo. ¡Sigue intentando!");
            } else {
                adivinado = true;
            }
        }

        System.out.println("¡Felicitaciones! ¡Has adivinado la fecha objetivo!");
        scanner.close();
    }

    public static LocalDate generarFechaAleatoria() {
        int year = (int) (Math.random() * 10000) + 1;
        int month = (int) (Math.random() * 12) + 1;
        int day = (int) (Math.random() * 28) + 1;

        return LocalDate.of(year, month, day);
    }
}
