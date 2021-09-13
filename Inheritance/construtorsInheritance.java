class Parent{
    public Parent(){
        System.out.println("Non-Param of Parent");
    }
    // public Parent(int x){
    //     System.out.println("Param of Parent "+x);
    // }
}
class Child extends Parent{
    public Child(){
        System.out.println("Non-Param of Child");
    }
    // public Child(int y){
    //     System.out.println("Param of Child");
    // }
    // public Child(int x, int y){
    //     super(x);
    //     System.out.println("2 Param of Child "+y);
    // }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Construtor");
    }
    // public GrandChild(int z){
    //     System.out.println("Param of GrandChild");
    // }
}
public class construtorsInheritance {
    public static void main(String[] args) {
        // GrandChild gc = new GrandChild();
    }
}
