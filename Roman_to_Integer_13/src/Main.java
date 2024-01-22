//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int ans = 0;
        int maxLength = s.length() - 1;

        for (int i = 0, j = 0; i <= maxLength; ++i) {
            if (i < maxLength)  {
                ++j;
            }

            switch (s.charAt(i)) {
                case 'I':
                    switch (s.charAt(j)) {
                        case 'V':
                            ans += 4;
                            ++i;
                            ++j;
                            continue;
                        case 'X':
                            ans += 9;
                            ++i;
                            ++j;
                            continue;
                        default:
                            ++ans;
                    }
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    switch (s.charAt(j)) {
                        case 'L':
                            ans += 40;
                            ++i;
                            ++j;
                            continue;
                        case 'C':
                            ans += 90;
                            ++i;
                            ++j;
                            continue;
                        default:
                            ans += 10;
                    }
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    switch (s.charAt(j)) {
                        case 'D':
                            ans += 400;
                            ++i;
                            ++j;
                            continue;
                        case 'M':
                            ans += 900;
                            ++i;
                            ++j;
                            continue;
                        default:
                            ans += 100;
                    }
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }
        }

        System.out.println("ans = " + ans);
    }
}