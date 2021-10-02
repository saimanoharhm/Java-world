class Outer{
  int x = 10;
  class Inner{
    int y = 20;
    public void innerDisplay(){
      System.out.println("Inner Display: "+x+" "+y);
    }
  }
  public void outerDisplay(){
    Inner i = new Inner();
    i.innerDisplay();
    System.out.println("Inner Value: "+i.y);
  }
}
public class nestedInnerClass {
  public static void main(String[] args) {
    Outer o = new Outer();
    o.outerDisplay();
    Outer.Inner oi = new Outer(). new Inner();
    oi.innerDisplay();
  }
}