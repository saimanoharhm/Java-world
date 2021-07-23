public class studentChallenge2 {
    public static void main(String[] args) {
        int b = 100110010;
        String H = "234AB";
        String date = "21/07/2021";
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        System.out.println(H.matches("[0-9A-F]+"));
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
