/*Dado un objeto LocalTime ingresado por el usuario, crear un nuevo LocalTime que
 represente exactamente la mitad del día entre el objeto dado y la medianoche */

import java.time.LocalTime;
import java.time.Duration;

public class MitadTiempo {
    public static void main(String[] args) {
        // Supongamos que el usuario ingresa un objeto LocalTime
        LocalTime tiempoIngresado = LocalTime.of(9, 0, 0);
        System.out.println("Tiempo ingresado: " + tiempoIngresado);

        // Obtener medianoche del día actual
        LocalTime medianoche = LocalTime.MIDNIGHT;

        // Calcular la mitad del día entre tiempoIngresado y medianoche
        Duration duracionHastaMedianoche = Duration.between(tiempoIngresado, medianoche);
        LocalTime mitadDelDia = tiempoIngresado.plus(duracionHastaMedianoche.dividedBy(2));
        System.out.println("Mitad del día: " + mitadDelDia);
    }
}
