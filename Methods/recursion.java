public class recursion {
    static void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }
    static void fun1(int n){
        if(n>0){
            System.out.println(n);
            fun1(n-1);
        }
    }
    public static void main(String[] args) {
        fun(5);
        System.out.println("\nNext \n");
        fun1(5);
    }
}
