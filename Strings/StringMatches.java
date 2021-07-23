public class StringMatches {
    public static void main(String[] args) {
        String str1 = "d";
        String str2 = "A7";
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str2.matches("[A-Z][0-9]"));
        System.out.println(str1.matches("\\w"));
        String str3 = "aabbcca";
        System.out.println(str3.matches("[abc]{3,8}"));
    }
}
