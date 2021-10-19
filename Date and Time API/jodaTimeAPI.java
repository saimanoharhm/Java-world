// import java.util.*;
import java.time.*;
public class jodaTimeAPI {
  public static void main(String[] args) {
    // Date d = new Date();
    // d.setHours(21); 
    // System.out.println(d);
    
    
    LocalDate d1 = LocalDate.now();
    LocalDate d2 = LocalDate.now(Clock.systemDefaultZone());
    LocalDate d3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
    LocalDate d4 = LocalDate.ofEpochDay(1);
    LocalDate d5 = LocalDate.parse("2021-01-03");
    LocalDate d6 = d5.plusMonths(6);

    System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6);

    LocalTime t1 = LocalTime.now();
    LocalTime t2 = t1.minusHours(3);
    System.out.println(t1+" "+t2);

    LocalDateTime dt1 = LocalDateTime.now();
    System.out.println(dt1);
  }
}
