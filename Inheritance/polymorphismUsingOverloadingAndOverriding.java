
// Method Overloading
class Test{
  public int max(int a, int b){
    return a>b?a:b;
  }
  public int max(int a, int b, int c){
    if(a>b && a>c)return a;
    else if(b>c) return b;
    return c;
  }
}

// Method Overriding
class Super3{
  public void display(){
    System.out.println("Super display");
  }
}

class Sub3 extends Super3{
  public void display(){
    System.out.println("Sub Display");
  }
}

public class polymorphismUsingOverloadingAndOverriding {
  public static void main(String[] args) {
    // Test t = new Test();
    // t.max(10, 5);
    // t.max(10, 15,5);

    Super3 s = new Sub3();
    s.display();
  }
}
