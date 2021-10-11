class InnerstaticMembers {
  static int x = 10;
  int y = 20;
  void show(){
    System.out.println(x+" "+y);
  }
  static void display(){
    System.out.println(x);
  }
}

public class staticMembers {
  public static void main(String[] args) {
    InnerstaticMembers i = new InnerstaticMembers();
    i.show();
    // i.x = 30;
    i.y = 50;

    InnerstaticMembers i2 = new InnerstaticMembers();
    i2.show();
  }
}
