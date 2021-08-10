import java.util.Scanner;

public class studentChallenge1 {
    // 1.Finding sum of elements
    public static void main(String[] args) {
        // int A[] = {3,5,6,7,8,9};
        // int sum = 1;
        // for(int x:A){
        //     sum += x;
        // }
        // System.out.println("Sum: "+sum);

        //2. Searching an Element
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the key element: ");
        // int key = sc.nextInt();
        // int B[] = {3,9,7,8,5,12,6,45,1,5};
        // for(int i=0;i<B.length;i++){
        //     if(B[i] == key){
        //         System.out.println("Element is found at "+i);
        //         System.exit(0);
        //     }
        // }
        // System.out.println("Element is not found");
        // sc.close();

        //3. Finding Maximum Element
        // int C[] = {3,9,7,8,5,12,6,45,1,5};
        // int max = C[0];
        // for(int i =0;i<C.length; i++){
        //     if(C[i]>max){
        //         max = C[i];
        //     }
        // }
        // System.out.println("The maximum is: "+max);

        // 4. Find the Second Largest Element 
        int D[] = {4,5,9,7,4,6,3,15};
        
        int max1, max2;
        max1 = max2 = D[0];

        for(int  i=0; i<D.length; i++){
            if(D[i] > max1){
                max2 = max1;
                max1 = D[i];
            }
            else if(D[i] > max2){
                max2 = D[i];
            }
        }
        System.out.println("The second largest element in the array is: "+max2);
    }
}
