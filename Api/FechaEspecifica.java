/*Crear un objeto LocalDate representando una fecha específica, como tu cumpleaños */

import java.time.LocalDate;

public class FechaEspecifica {
    public static void main(String[] args) {
        int year = 1990;  // Año de nacimiento
        int month = 8;    // Mes de nacimiento (1-12)
        int day = 25;     // Día de nacimiento

        LocalDate fechaEspecifica = LocalDate.of(year, month, day);
        System.out.println("Fecha específica: " + fechaEspecifica);
    }
}
 
