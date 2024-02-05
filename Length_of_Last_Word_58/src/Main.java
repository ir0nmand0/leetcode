public class Main {
    public static void main(String[] args) {
        System.out.println("lengthOfLastWord(\"Hello World\") = " + lengthOfLastWord("Hello World"));
        System.out.println("lengthOfLastWord(\"   fly me   to   the moon  \") = " 
                + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("lengthOfLastWord(\"luffy is still joyboy\") = "
                + lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {

//        String[] str = s.split(" ");
//        return str[str.length-1].length();

        final char[] s1 = s.toCharArray();

        int count = 0;

        for (int i = s1.length - 1; i >= 0; --i) {
            if (s1[i] != ' ') {
                ++count;
            } else if (count >= 1) {
                return count;
            }
        }

        return 0;
    }
}