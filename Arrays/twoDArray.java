public class twoDArray {
    public static void main(String[] args) {
        // int A[][] = new int[5][5];
        int B[][] = {{1,2,3},{3,4,5},{7,8,9}};
        // int C[][];
        // C = new int[5][5];
        // int []D[] = new int[5][5];
        // int []E,F[];
        // E = new int[5];
        // F = new int[5][5];
        // for(int i =0;i<B.length;i++){
        //     for(int j=0;j<B[0].length;j++){
        //         System.out.print(B[i][j]+" ");
        //     }
        //     System.out.print("\n");
        // }
        // System.out.println("Length: "+B.length);
        // for(int x[] : B){
        //     for(int y:x){
        //         System.out.print(y+" ");
        //     }
        //     System.out.print("\n");
        // }
        // System.out.println("Length: "+B.length);
        // jagged Array
        int A[][];
        A = new int[3][];
        A[0] = new int[5];
        A[1] = new int[3];
        A[2] = new int[4];
        
        for (int x[]:A) {
            for (int y :x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
