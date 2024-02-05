public class Main {
    public static void main(String[] args) {
        System.out.println("strStr(\"sadbutsad\", \"sad\") = " + strStr("sadbutsad", "sad"));
        System.out.println("strStr(\"leetcode\", \"leeto\") = " + strStr("leetcode", "leeto"));
        System.out.println("strStr(\"mississippi\", \"issip\") = " + strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {

        //return haystack.indexOf(needle);

        int iter = 0;
        int end = needle.length() - 1;
        
        for (int i = 0; i < haystack.length(); ++i) {
            if (haystack.charAt(i) == (needle.charAt(iter))) {
                if (end == iter) {
                    return i - iter;
                }
                ++iter;
            } else if (iter > 0) {
                i -= iter;
                iter = 0;
            }
        }

        return -1;
    }
}