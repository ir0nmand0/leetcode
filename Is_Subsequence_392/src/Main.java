public class Main {
    public static void main(String[] args) {
        System.out.println("isSubsequence(\"abc\", \"ahbgdc\") = " + isSubsequence("abc", "ahbgdc"));
        System.out.println("isSubsequence(\"axc\", \"ahbgdc\") = " + isSubsequence("axc", "ahbgdc"));
        System.out.println("isSubsequence(\"abc\", \"ahbgdc\") = " + isSubsequence("abc", "ahbgdc"));
        System.out.println("isSubsequence(\"aaaaaa\", \"bbaaaa\") = " + isSubsequence("aaaaaa", "bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int point = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = point; j < t.length(); ++j) {
                if (s.charAt(i) == t.charAt(j)) {
                    ++count;
                    point = j + 1;
                    break;
                }
            }
        }

        return count == s.length();
    }
}