/*Desarrolla un "reloj mundial" que muestra la hora actual en varias ciudades importantes alrededor
 del mundo: Nueva York, Londres, París, Tokio, Sydney, Buenos Aires, Bogotá, Lima, Madrid, Ciudad del Cabo */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class RelojMundial {

    public static void main(String[] args) {
        // Definir las ciudades y sus respectivas zonas horarias
        String[][] ciudades = {
                {"Nueva York", "America/New_York"},
                {"Londres", "Europe/London"},
                {"París", "Europe/Paris"},
                {"Tokio", "Asia/Tokyo"},
                {"Sídney", "Australia/Sydney"},
                {"Buenos Aires", "America/Argentina/Buenos_Aires"},
                {"Bogotá", "America/Bogota"},
                {"Lima", "America/Lima"},
                {"Madrid", "Europe/Madrid"},
                {"Ciudad del Cabo", "Africa/Johannesburg"}
        };

        // Obtener la hora actual en cada ciudad
        for (String[] ciudad : ciudades) {
            String nombreCiudad = ciudad[0];
            String zonaHoraria = ciudad[1];
            LocalDateTime horaActual = LocalDateTime.now(ZoneId.of(zonaHoraria));
            String horaFormateada = horaActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(nombreCiudad + ": " + horaFormateada);
        }
    }
}
