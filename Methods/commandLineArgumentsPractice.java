public class commandLineArgumentsPractice {
    public static void main(String[] args) {
        // for(String s: args){
        //     System.out.println(s);
        // }
        // for(int i=0; i < args.length; i++){
        //     System.out.println(args[i]);
        // }

        // Student Challenge -3 : Adding Numbers using command Line
        double sum = 0;
        for(int i=0; i< args.length;i++){
            if(args[i].matches("[0-9\\.]+"))
                sum += Double.parseDouble(args[i]);
        }
        System.out.println("Sum is: "+sum);
    }
}
