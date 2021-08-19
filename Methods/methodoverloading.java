public class methodoverloading {
    static int Max(int x, int y){
        return x>y?x:y;
    }
    static float Max(float x, float y){
        return x>y?x:y;
    }
    static int Max(int x, int y, int z){
        return x>y && x>z ? x:(y>z?y:z);
    }
    public static void main(String[] args) {
        System.out.println(Max(5, 3));
        System.out.println(Max(5.1f, 7.7f));
        System.out.println(Max(4, 9, 1));
    }
}