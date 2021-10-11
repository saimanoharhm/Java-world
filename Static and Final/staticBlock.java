class Test{
  static{
    System.out.println("BLOCK 1");
  }
  static{
    System.out.println("BLOCK 2");
  }
}

public class staticBlock {
  public static void main(String[] args) {
    System.out.println("Main");
    // Test t = new Test();
  }
}
