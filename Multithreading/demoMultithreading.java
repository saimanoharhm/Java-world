// Method-1
// class MyThread extends Thread{
//   public void run()
//   {
//     int i = 1; 
//     while(true){
//       System.out.println(i+"Hello");
//       i++;
//     }
//   }
// }
// public class demoMultithreading {
//   public static void main(String[] args) {
//     MyThread t = new MyThread();
//     t.start();
//     int i = 1;
//     while(true){
//       System.out.println(i+"World");
//       i++;
//     }
//   }
// }

// // Method-2
// public class demoMultithreading extends Thread{
//   public void run()
//   {
//     int i = 1; 
//     while(true){
//       System.out.println(i+"Hello");
//       i++;
//     }
//   }
//   public static void main(String[] args) {
//     demoMultithreading t = new demoMultithreading();
//     t.start();
//     int i = 1;
//     while(true){
//       System.out.println(i+"World");
//       i++;
//     }
//   }
// }

// // Method-3 (Interface)
// public class demoMultithreading implements Runnable{
//   public void run()
//   {
//     int i = 1; 
//     while(true){
//       System.out.println(i+"Hello");
//       i++;
//     }
//   }
//   public static void main(String[] args) {
//     demoMultithreading t = new demoMultithreading();
//     Thread th = new Thread(t);
//     th.start();
//     int i = 1;
//     while(true){
//       System.out.println(i+"World");
//       i++;
//     }
//   }
// }

// Method-4 (Interface)

class MyRunnable implements Runnable{
  public void run()
  {
    int i = 1; 
    while(true){
      System.out.println(i+"Hello");
      i++;
    }
  }
}

public class demoMultithreading {
  
  public static void main(String[] args) {
    MyRunnable t = new MyRunnable();
    Thread th = new Thread(t);
    th.start();
    int i = 1;
    while(true){
      System.out.println(i+"World");
      i++;
    }
  }
}
