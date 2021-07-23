public class studentChallenge3 {
    public static void main(String[] args) {
        //Remove Special characters from string.
        String str = "a!B@C#1#23@$";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        //Remove extra spaces from string.
        String str2 = "abc de fgh ijk";
        System.out.println(str2.replaceAll("\\s+",""));
        //Find number of words in a string.
        String str3 = "    abc    de    fgh    ijk    ";
        str3 = str3.replaceAll("\\s+", " ").trim();
        String words[] = str3.split("\\s");
        System.out.println(words.length);
    }
}
