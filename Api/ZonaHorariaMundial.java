/*Dado un objeto LocalDateTime, encontrar el ZonedDateTime correspondiente para todas las zonas
 horarias donde el reloj marca las 10:15 AM en este momento.

💡Nota: Puedes usar ZoneId.getAvailableZoneIds() para obtener todas las zonas horarias disponibles e
 iterarlas */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonaHorariaMundial {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        // Obtener todas las zonas horarias disponibles
        Set<String> zonasHorarias = ZoneId.getAvailableZoneIds();

        // Buscar el ZonedDateTime correspondiente para las zonas horarias
        for (String zonaHoraria : zonasHorarias) {
            ZoneId zoneId = ZoneId.of(zonaHoraria);
            ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
            int hour = zonedDateTime.getHour();
            int minute = zonedDateTime.getMinute();

            if (hour == 10 && minute == 15) {
                System.out.println("Zona horaria: " + zonaHoraria);
                System.out.println("ZonedDateTime: " + zonedDateTime);
            }
        }
    }
}
