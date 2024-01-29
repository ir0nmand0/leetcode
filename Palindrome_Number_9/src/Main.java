public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
        System.out.println("isPalindrome(-121) = " + isPalindrome(-121));
        System.out.println("isPalindrome(10) = " + isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int tmp = x;

        while (tmp != 0) {
            int digit = tmp % 10;
            reversed = reversed * 10 + digit;
            tmp /= 10;
        }

        return reversed == x;
    }
}