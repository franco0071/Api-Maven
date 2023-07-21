/*Dada una cantidad de segundos ingresada por el usuario, convertirlo en un LocalTime y 
mostrárselo al usuario */

import java.time.LocalTime;

public class SegundosConvertidos {
    public static void main(String[] args) {
        // Supongamos que el usuario ingresa la hora "18:45:30"
        LocalTime horaIngresada = LocalTime.of(18, 45, 30);
        System.out.println("Hora ingresada: " + horaIngresada);

        // Obtener la próxima hora exacta
        LocalTime proximaHoraExacta = horaIngresada.plusHours(1).withMinute(0).withSecond(0);
        System.out.println("Próxima hora exacta: " + proximaHoraExacta);
    }
}
