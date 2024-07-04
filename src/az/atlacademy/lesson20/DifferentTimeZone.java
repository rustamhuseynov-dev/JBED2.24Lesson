package az.atlacademy.lesson20;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        //ZoneId.of(String zoneId)metodu dünyanın müxtəlif vaxt qurşaqları ilə işləməyi asanlaşdıraraq,
        // müəyyən bir zaman dövrünü təmsil edən obyekt ZoneIdyaratmaq üçün istifadə olunur .
        // Siz etibarlı saat qurşağı identifikatorlarından istifadə edərək müxtəlif bölgələr üçün dəqiq vaxt məlumatı əldə edə bilərsiniz.

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        //ZonedDateTime.now(zoneId), ilə siz müəyyən edilmiş müddət ərzində cari tarix və vaxtı əldə edirsiniz.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        //DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")ilə siz tarix və vaxtı oxuna bilən formatda göstərəcək formatlayıcı yaradırsınız.

        System.out.println(zonedDateTime.format(formatter));
    }
}
