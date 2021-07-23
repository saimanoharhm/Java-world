public class studentChallenge1 {
    public static void main(String[] args) {
        String str = "saimanohar987@gmail.com";
        int i = str.indexOf("@");
        String userName = str.substring(0,i);
        String domainName = str.substring(i+1,str.length());
        System.out.println("Username: "+userName+" "+"DomainName: "+domainName);
        int dot = str.indexOf(".");
        String domain = str.substring(i+1, dot);
        boolean issame = domain.equals("gmail");
        System.out.println("Is email id from gmail: "+issame);
    }
}
