public class stringMethods {
    public static void main(String[] args) {
        String str = new String("Mr. Annam Sai Manohar");
        String str2 = str.substring(3,5);
        String str3 = str.replace('a', 'R');
        boolean str4 = str.startsWith("Mr.");
        char str5 = str.charAt(5);
        int str6 = str.indexOf('.');
        String str7 = "mr. annam sai manohar";
        boolean str8 = str.equalsIgnoreCase(str7);
        boolean str9 = str.equals(str7);
        System.out.println(str8+" "+str9);
    }
}