/*Crear un objeto LocalTime para representar una hora específica, luego usar
 ese objeto para calcular cuántas horas, minutos y segundos quedan hasta la medianoche */

import java.time.LocalTime;
import java.time.Duration;

public class HoraEspecifica {
    public static void main(String[] args) {
        // Crear un objeto LocalTime para representar una hora específica
        LocalTime horaEspecifica = LocalTime.of(21, 30, 0); // Hora específica: 21:30:00
        System.out.println("Hora específica: " + horaEspecifica);

        // Calcular la duración hasta la medianoche
        LocalTime medianoche = LocalTime.MIDNIGHT;
        Duration duracionHastaMedianoche = Duration.between(horaEspecifica, medianoche);

        // Obtener las horas, minutos y segundos de la duración
        long horasHastaMedianoche = duracionHastaMedianoche.toHours();
        long minutosHastaMedianoche = duracionHastaMedianoche.toMinutesPart();
        long segundosHastaMedianoche = duracionHastaMedianoche.toSecondsPart();

        System.out.println("Horas hasta la medianoche: " + horasHastaMedianoche);
        System.out.println("Minutos hasta la medianoche: " + minutosHastaMedianoche);
        System.out.println("Segundos hasta la medianoche: " + segundosHastaMedianoche);
    }
}
