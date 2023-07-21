/*Crear un objeto LocalDate representando la fecha actual. */

import java.time.LocalDate;

public class FechaActual {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
    }
}
