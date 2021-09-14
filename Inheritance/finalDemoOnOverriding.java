// Do's and Don't's of overriding
class A{}
class B extends A{}

class Super2{
  public A display(){
    System.out.println("Super Display");
    return new A();
  }
}
class Sub2 extends Super2{
  public B display(){
    System.out.println("Sub Display");
    return new B();
  }
}
public class finalDemoOnOverriding {
  public static void main(String[] args) {
    Sub2 s = new Sub2();

  }
}
