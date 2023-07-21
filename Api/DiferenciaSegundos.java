/*Calcular la diferencia en segundos entre dos objetos LocalTime. */

import java.time.LocalTime;
import java.time.Duration;

public class DiferenciaSegundos {
    public static void main(String[] args) {
        // Supongamos que tenemos dos objetos LocalTime
        LocalTime tiempo1 = LocalTime.of(10, 15, 30);
        LocalTime tiempo2 = LocalTime.of(11, 30, 45);

        // Calcular la diferencia en segundos entre tiempo1 y tiempo2
        long diferenciaEnSegundos = Duration.between(tiempo1, tiempo2).getSeconds();
        System.out.println("Diferencia en segundos: " + diferenciaEnSegundos);
    }
}
