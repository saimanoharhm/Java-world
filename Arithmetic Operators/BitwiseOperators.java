public class BitwiseOperators {
    public static void main(String[] args) {
        // int x=0b1010; //10
        // int y=0b0110; //6
        // int z;
        // z = x^y; 
        // System.out.println(z);
        int x = 0b1010;
        int y,z,a,n;
        n = ~x;
        y = x<<1;
        z = x>>1;
        a = x>>>1;
        System.out.println(y+" "+z+"\n"+String.format("%s",Integer.toBinaryString(a)));
        System.out.println("\n"+String.format("%s",Integer.toBinaryString(x)));
        System.out.println("Not: "+n);
    }
}
