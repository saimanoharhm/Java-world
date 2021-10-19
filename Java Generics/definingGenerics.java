class Data <T>
{
  private T obj;
  public void setData(T v){
    obj = v;
  }
  public T getData(){
    return obj;
  }
}

@SuppressWarnings("unchecked")
class MyArray <T>{
  T a[] =(T[]) new Object[10];
  int length = 0;
  public void append(T v){
    a[length++] = v;
  }
  public void display(){
    for(int i=0;i<length;i++){
      System.out.println(a[i]);
    }
  }
}

class MyArray2 extends MyArray<String>
{

}

class MyArray3 <T extends Number>
{

}

public class definingGenerics {
  static <E extends Number> void show(E... list){
    for(E x:list){
      System.out.println(x);
    }
  }
  public static void main(String[] args) {
    // Data<Integer> d = new Data<>();
    // d.setData(10);
    // System.out.println(d.getData());
    /////MyArray///////
    // MyArray<Integer> ma = new MyArray<>();
    // ma.append(10);
    // ma.append(20);
    // ma.append(30);
    // ma.append(40);
    // ma.display();
    show("Hi","Go","Bye");
    show(10,20,30,40);
  }
}
