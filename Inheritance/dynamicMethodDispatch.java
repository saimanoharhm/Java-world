class Super1 {
  public void meth1(){System.out.println("Super Meth1");}
  public void meth2(){System.out.println("Super Meth2");}
}
class Sub1 extends Super1{
  public void meth2(){System.out.println("Super Meth2");}
  public void meth3(){System.out.println("Super Meth3");}
}

public class dynamicMethodDispatch {
  public static void main(String[] args) {
    Super1 sb = new Sub1();
    sb.meth1();
    sb.meth2();
    // sb.meth3();
  }
}
