public class firstmethod {
    // int max(int x, int y){
    //     if(x>y){
    //         return x;
    //     }
    //     else{
    //         return y;
    //     }
    // }
    // public static void main(String[] args) {
    //     int a = 10,b=15;
    //     firstmethod fm = new firstmethod();
    //     System.out.println(fm.max(a, b));
    // }
    // Objects as Parameters
    static void change(int X[], int index, int value){
        X[index] = value;
    }
    static void change2(int x, int value){
        x = value;
    }
    public static void main(String[] args) {
        int A[] = {2,4,5,8,10};
        change(A,2,20);
        for(int x: A){
            System.out.println(x);
        }
        int x = 10;
        change2(x,20);
        System.out.println("Value of primitive data type: "+x);
    }
}