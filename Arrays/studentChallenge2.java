import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
        // 1. Left Rotation of an array.
        // int A[] = {1,5,6,7,9,4,5};
        // int temp = A[0];
        // for(int i=1;i<A.length;i++){
        //     A[i-1] = A[i];
        // }
        // A[A.length-1] = temp;
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }

        //2. Right Rotation of an array. 
        // int B[] = {1,5,6,7,9,4,5};
        // int temp = B[B.length-1];
        // for(int i=B.length-1;i>0;i--){
        //     B[i] = B[i-1];
        // }
        // B[0] = temp;
        // for(int i=0;i<B.length;i++){
        //     System.out.print(B[i]+" ");
        // }

        //3. Inserting an Element
        // int A[] = new int[10];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many number of elments would like to add: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the elements: ");
        // for(int  i=0;i<n;i++){
        //     A[i] = sc.nextInt();
        // }
        // System.out.println("Enter the element that you would like to insert and index: ");
        // int x = sc.nextInt();
        // int index = sc.nextInt();
        // for(int  i = n; i>index;i--){
        //     A[i] = A[i-1];
        // }
        // A[index] = x;
        // System.out.print("The elements are: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(A[i]+" ");
        // }

        // 4. Deleting an Element
        int A[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of elments would like to add: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int  i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the index that you would like to Delete: ");
        int index = sc.nextInt();
        int x = A[index];
        for(int  i = index; i<n;i++){
            A[i] = A[i+1];
        }
        System.out.print("The elements are: ");
        for(int i=0;i<n-1;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.println("Element is found "+ x);
        sc.close();    
    }
}
