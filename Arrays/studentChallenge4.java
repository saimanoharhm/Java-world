public class studentChallenge4 {
    public static void main(String[] args) {
        // // int A[][] = {{3,5,7},{4,5,6},{1,2,3}};
        // // int B[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // // int C[][] = new int[3][3];

        // //1. Adding 2 Matrices
        // for(int i=0;i<A.length;i++){
        //     for(int j=0;j<A[0].length;j++){
        //         C[i][j] = A[i][j]+B[i][j];
        //     }
        // }

        // for(int x[]:C){
        //     for(int y:x){
        //         System.out.print(y+" ");
        //     }
        //     System.out.println("");
        // }
        // 2. Multiplying 2 Matrices
        // int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        // int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        // int C[][]=new int[3][3];
    
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         C[i][j]=0;
        //         for(int k=0;k<3;k++)
        //         {
        //             C[i][j]=C[i][j]+A[i][k]*B[k][j];
        //         }
        //     }
        // }
        
        // for(int x[]:C)
        // {
        //     for(int y:x)
        //     {
        //         System.out.print(y+" ");
        //     }
        //     System.out.println("");
        // }
        //3. Sorting Array of strings.
        String str[]={"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(str);

        for(String x:str){
            System.out.println(x);
        }
    }
}
