// class Parent1{
//   public Parent1(){
//       System.out.println("Non-Param of Parent");
//   }
//   public Parent1(int x){
//       System.out.println("Param of Parent "+x);
//   }
// }
// class Child1 extends Parent1{
//   public Child1(){
//       System.out.println("Non-Param of Child");
//   }
//   public Child1(int y){
//       System.out.println("Param of Child");
//   }
//   public Child1(int x, int y){
//       super(x);
//       System.out.println("2 Param of Child "+y);
//   }
// }
// public class parameterisedConstrutor{
//   public static void main(String[] args) {
//       Child1 c = new Child1(20,10);
//   }
// }

class Rectangle{
  int length;
  int breadth;

  Rectangle(){
    length=breadth=1;
  }
  Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
}

class Cuboid extends Rectangle{
  int height;

  Cuboid(){
    height = 1;
  }
  Cuboid(int h){
    height = h;
  }
  Cuboid(int l, int b,int h){
    super(l,b);
    height = h;
  }
  int volume(){
    return length*breadth*height;
  }

}
public class parameterisedConstrutor{
  public static void main(String[] args) {
      Cuboid c = new Cuboid(5,3,10);
      System.out.println(c.volume());
  }
}
