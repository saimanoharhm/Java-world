public class studentChalleneg6_pattern {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j>=i){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i<=j){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println("");
        // }
        for (int i = 1; i <= 5; i++)



    {

      for (int j = 1; j <= 5; j++) {

        if (i + j > 5) {

          System.out.print("* ");

        }

        else {

          System.out.print("  ");

        }

      }

      for (int k = 1; k <= 5; k++) {

        if (k <= i - 1) {

          System.out.print("* ");

        }

        else {

          System.out.print("  ");

        }

      }

      System.out.println(" ");

    }



    for (int a = 1; a <= 5; a++)



    {

      for (int b = 1; b <= 5; b++) {

        if (b > a) {

          System.out.print("* ");

        }

        else {

          System.out.print("  ");

        }

      }

      for (int c = 1; c <= 4; c++) {

        if (a + c <= 4) {

          System.out.print("* ");

        }

        else {

          System.out.print("  ");

        }

      }

      System.out.println(" ");

    }

  }



}
