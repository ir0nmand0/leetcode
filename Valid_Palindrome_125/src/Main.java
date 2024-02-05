public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome(\"A man, a plan, a canal: Panama\") = " 
                + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("isPalindrome(\"race a car\") = " + isPalindrome("race a car"));
        System.out.println("isPalindrome(\" \") = " + isPalindrome(" "));
        System.out.println("isPalindrome(\"0P\") = " + isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        final char[] charArray = s.toCharArray();
        char[] clearChar = new char[charArray.length];
        int iter = 0;

        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                clearChar[iter++] = charArray[i];
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                clearChar[iter++] = (char) (charArray[i] + 32); //Расстояние между большими и маленькими в ASCII
            } else if (charArray[i] >= '0' && charArray[i] <= '9') {
                clearChar[iter++] = charArray[i];
            }
        }

        for (int i = 0, j = iter - 1; 0 <= j; --j, ++i) {
            if (clearChar[i] != clearChar[j]) {
                return false;
            }
        }

        return true;
    }
}