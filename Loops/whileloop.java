/**
 * whileloop
 */
public class whileloop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("While Loop: ");
        while(i<100){
            System.out.println(i);
            i=i*2;
        }
        i = 1;
        System.out.println("do while Loop: ");
        do{
            System.out.println(i);
            i = i*2;
        }while(i<100);
    }
}