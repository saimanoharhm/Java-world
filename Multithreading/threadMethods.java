////////Sleep and Interrupt Methods/////////
// class Mythread extends Thread{
//   public Mythread(String name)
//   {
//     super(name);
//   }
//   public void run(){
//     int count = 1;
//     while(true){
//       System.out.println(count++);
//       try{
//         Thread.sleep(1000);
//       }
//       catch(InterruptedException e){
//         System.out.println(e);
//       }
//     }
//   }
// }
// public class threadMethods {
//   public static void main(String[] args) throws Exception {
//     Mythread t = new Mythread("My Thread 1");
//     t.start();
//     t.interrupt();

//     // System.out.println("ID "+t.getId());
//     // System.out.println("Name "+t.getName());
//     // System.out.println("Priority "+t.getPriority());
//     // System.out.println("State "+t.getState());
//     // System.out.println("Alive "+t.isAlive());
//   }
// }

/////// Daemon,join and yield Methods /////////
class Mythread extends Thread{
  public void run(){
    int count = 1;
    while(true){
      System.out.println(count++ +" My Thread");
    }
  }
}

public class threadMethods {
  public static void main(String[] args) throws Exception {
    Mythread t = new Mythread();
    t.start();
    int count = 1;
    while(true){
      System.out.println(count++ +" Main");
      Thread.yield();
    }

    // t.setDaemon(true);
    // t.start();
    // Thread mainThread = Thread.currentThread();
    // mainThread.join();
  }
}
