// abstract class My{
//   abstract public void show();
// }

// interface My{
//   void show();
// }

// class Outer1{
//   public void display(){
//     class Inner{
//       public void show(){
//         System.out.println("Hello");
//       }
//     }
//     Inner i = new Inner();
//     i.show();
//   }
// }

// class Outer2{
//   public void display(){
//     new My(){
//       public void show(){
//         System.out.println("Hello");
//       }
//     }.show();
//     // m.show();
//   }
// }

class Outer3{
  int x= 10;
  static int y = 20;
  static class My{
    public void show(){
      System.out.println(y);
    }
  }
}

public class localandStaticInnerClasses {
  public static void main(String[] args) {
    // Outer1 o = new Outer1();
    Outer3.My m = new Outer3.My();
    m.show();    
  }
}
