import java.util.*;
abstract class Parent 
{
  public void display(){}
}
class Child extends Parent{
  @Override
  public void display()
  {
    System.out.println("Hello");
  }
  @Deprecated
  public void show(){
    System.out.println("HI");
  }
}

public class builtInAnnotations {
  static List l;
  @SuppressWarnings("unChecked")
  public static void main(String[] args) {
    l.add(10);
    Child c = new Child();
    c.show();
  }
}
