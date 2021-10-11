import mypack1.demo;
import mypack1.demo2;
import mypack2.accessModifiers;

public class Test {
  public static void main(String[] args) {
    // demo d1 = new demo();
    // d1.display();
    // demo2 d2 = new demo2();
    // d2.display();
    accessModifiers am = new accessModifiers();
    am.display();
    System.out.println(am.a+am.b+am.c+am.d);
  }
}
