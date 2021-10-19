import java.time.*;

public class javaTimeClasses {
  public static void main(String[] args) {
    OffsetDateTime odt1 = OffsetDateTime.now();
    System.out.println(odt1);

    ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    ZonedDateTime zdt2 = ZonedDateTime.now();
    System.out.println(zdt1+" "+zdt2);

    Period p1 = Period.of(2,2,10);
    System.out.println(p1.addTo(LocalDate.now()));

    Instant i1 = Instant.now();
    System.out.println(i1);
  }
}
