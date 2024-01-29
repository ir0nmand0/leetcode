public class Main {
    public static void main(String[] args) {
        System.out.println("gcdOfStrings(\"ABCABC\", \"ABC\") = " + gcdOfStrings("ABCABC", "ABC"));
        System.out.println("gcdOfStrings(\"ABABAB\", \"ABAB\") = " + gcdOfStrings("ABABAB", "ABAB"));
        System.out.println("gcdOfStrings(\"LEET\", \"CODE\") = " + gcdOfStrings("LEET", "CODE"));

    }

    public static String gcdOfStrings(String str1, String str2) {
        return ((str1 + str2).equals(str2 + str1)) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}