/*Crea un método que, dado un LocalDateTime, devuelva un ZonedDateTime que represente el mismo
 instante en la zona horaria de Tokio (Asia/Tokyo). */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonaHorariaTokio {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime tokyoDateTime = convertToTokyoTime(localDateTime);
        System.out.println("Tokyo time: " + tokyoDateTime);
    }

    public static ZonedDateTime convertToTokyoTime(LocalDateTime localDateTime) {
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoDateTime = ZonedDateTime.of(localDateTime, tokyoZone);
        return tokyoDateTime;
    }
}
