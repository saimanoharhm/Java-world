/**
 * studentChallenge3
 */
public class studentChallenge3 {
    public static void main(String[] args) {
        //1. Copying an Array
        // int A[] = {1,5,4,7,8,6};
        // int B[] = new int[A.length];
        // for(int i=0;i<A.length;i++){
        //     B[i] = A[i];
        // }
        // for(int x:B){
        //     System.out.print(x+" ");
        // }
        // 2. Reverse Copying an Array
        // int A[] = {1,5,4,7,8,6};
        // int B[] = new int[A.length];
        // for(int i=A.length-1,j=0;i>=0;i--,j++){
        //     B[j] = A[i];
        // }
        // for(int x:B){
        //     System.out.print(x+" ");
        // }
        // 3. Increasing size of Array
        int A[] = {1,5,4,7,8,6};
        System.out.println("The length of Array A before copying it is: "+A.length);
        int B[] = new int[2*A.length];
        for(int i=0;i<A.length;i++){
            B[i] = A[i];
        }
        A = B;
        B = null;
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println("\nThe length of Array A is: "+A.length);
    }
}