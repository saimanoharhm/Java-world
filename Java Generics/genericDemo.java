public class genericDemo<T> {
  T data[] = (T[]) new Object[3];
  public static void main(String[] args) {
    genericDemo<String> gd = new genericDemo<>();
    gd.data[0] = "hi";
    gd.data[1] = "bye";
    gd.data[2] = "world";
  }
}