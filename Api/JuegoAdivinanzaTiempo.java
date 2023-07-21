/*Basate en el último ejercicio de la sección anterior, pero esta vez en lugar de adivinar un LocalDate
 el usuario tiene que adivinar un LocalTime. */

import java.time.LocalTime;
import java.util.Scanner;

public class JuegoAdivinanzaTiempo {
    public static void main(String[] args) {
        LocalTime horaObjetivo = generarHoraAleatoria();
        System.out.println("¡Bienvenido al juego de adivinanza de hora!");

        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;

        while (!adivinado) {
            System.out.print("Ingresa una hora en formato HH:mm:ss: ");
            String horaString = scanner.nextLine();
            LocalTime horaIngresada = LocalTime.parse(horaString);

            if (horaIngresada.isBefore(horaObjetivo)) {
                System.out.println("La hora ingresada es antes de la hora objetivo. ¡Sigue intentando!");
            } else if (horaIngresada.isAfter(horaObjetivo)) {
                System.out.println("La hora ingresada es después de la hora objetivo. ¡Sigue intentando!");
            } else {
                adivinado = true;
            }
        }

        System.out.println("¡Felicitaciones! ¡Has adivinado la hora objetivo!");
        scanner.close();
    }

    public static LocalTime generarHoraAleatoria() {
        int hour = (int) (Math.random() * 24);
        int minute = (int) (Math.random() * 60);
        int second = (int) (Math.random() * 60);

        return LocalTime.of(hour, minute, second);
    }
}
