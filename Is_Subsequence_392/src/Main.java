public class Main {
    public static void main(String[] args) {
        System.out.println("isSubsequence(\"abc\", \"ahbgdc\") = " + isSubsequence("abc", "ahbgdc"));
        System.out.println("isSubsequence(\"axc\", \"ahbgdc\") = " + isSubsequence("axc", "ahbgdc"));
        System.out.println("isSubsequence(\"abc\", \"ahbgdc\") = " + isSubsequence("abc", "ahbgdc"));
        System.out.println("isSubsequence(\"aaaaaa\", \"bbaaaa\") = " + isSubsequence("aaaaaa", "bbaaaa"));
        System.out.println("isSubsequence(\"\", \"ahbgdc\") = " + isSubsequence("", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        } else if (t.isEmpty()) {
            return false;
        }

        final char[] s1 = s.toCharArray();
        final char[] t1 = t.toCharArray();

        int count = 0;

        for (int i = 0; i < t1.length; ++i) {
            if (t1[i] == s1[count]) {
                if (s1.length - 1 == count) {
                    return true;
                }

                ++count;
            }
        }

        return count == s1.length;
    }
}