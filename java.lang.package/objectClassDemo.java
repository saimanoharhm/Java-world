class MyObject
{
  public String toString(){
    return "My Object";
  }
  public boolean equals(Object o){
    return this.hashCode()==o.hashCode();
  }
}

public class objectClassDemo {
  public static void main(String[] args) {
    // Object o1 = new Object();
    // Object o2 = o1;

    // System.out.println(o1.equals(o2));
    // System.out.println(o1.hashCode());
    MyObject o1 = new MyObject();
    System.out.println(o1);
  }
}
