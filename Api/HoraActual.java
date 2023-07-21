/*Crear un objeto LocalTime representando la hora actual y obtener la cantidad 
de segundos que han pasado desde el inicio del día. */

import java.time.LocalTime;

public class HoraActual {
    public static void main(String[] args) {
        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        // Calcular los segundos transcurridos desde el inicio del día
        long segundosDesdeInicioDia = horaActual.toSecondOfDay();
        System.out.println("Segundos transcurridos desde el inicio del día: " + segundosDesdeInicioDia);
    }
}
