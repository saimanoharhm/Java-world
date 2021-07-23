public class conditional {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 15;
        // System.out.println(a<b || a>c);
        // int n = 5;
        // if(n>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
