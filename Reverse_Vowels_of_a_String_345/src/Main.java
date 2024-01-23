public class Main {
    public static void main(String[] args) {
        String s = "race car leetcode";
        int end = s.length() - 1;
        int start = 0;
        StringBuilder answer = new StringBuilder(s);

        while (start < end) {
            while (start < end && isVowels(answer.charAt(start))) {
                ++start;
            }

            while (start < end && isVowels(answer.charAt(end))) {
                --end;
            }

            char tmp = answer.charAt(start);
            answer.setCharAt(start, answer.charAt(end));
            answer.setCharAt(end, tmp);

            ++start;
            --end;
        }

        System.out.println("answer.toString() = " + answer.toString());
    }

    static boolean isVowels(char vowel) {
        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return false;
        }

        return true;
    }
}