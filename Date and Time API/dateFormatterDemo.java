import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;
public class dateFormatterDemo {
  public static void main(String[] args) {
    ZonedDateTime dt = ZonedDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
    System.out.println(df.format(dt));

    LocalDateTime dt2 = LocalDateTime.now();

    System.out.println(dt2.get(ChronoField.DAY_OF_YEAR));
  }
}
