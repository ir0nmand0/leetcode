import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("compress(new char[]{'a','a','b','b','c','c','c'}) = "
                + compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println("compress(new char[]{'a'}) = " + compress(new char[]{'a'}));
        System.out.println("compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}) = "
                + compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.println("" +
                + compress(new char[]{'x','7','7','2','2','2','f','\'','\'','\'','\'','}','=','l','l','+','_','_',':',':',':','o','u','u','l','X','4','n','n','n','y','y','Z','\'','g','q',',',',','Y',':','w','.','q',')',')','0','0','0','0','{','E','E','E','E',';','>','{','{',']',']','h','b','A','A','A','H','t','6','6','6','6','E','E','i','V','V','V','V','X','F',',','/','/','X','2','2','Z','Z','z','z','o','x','x','F','F','F','v','v','v','v','v','v','/','/','/','8','8','8','8','U','y','y','y','y','y','%','X','%','%','%','@','@','@','-',')','I','4','4','^','{','7','h','@','/','/','^','^','V','9','9','9','9','9','J','A','A','{','{','B','B','B','B','B','c','b','b','R','R','b','b','^','8','\'','\'','\'',')',')','n','n','/','e','/','/','S','Z','M','0','0','0','0','0','T','T','T',')',')','^','^','n','n',';','1','X','X','X','`','`','`','H','H','-','-','-','-','J','J','a','&','F','X','p','F','G','Y','|','v','v','=','H','G','G','G',';','m','m','m','m','h','h','h','h','M','*','*','h','K','k','k','k','k','(','(','(','B','B','B','c','c','c','c','w','3','3','3','3','3','3','B','B','}','p','p','G','x','x','=','-','<','<','<','Q','Q','&','&','J','J','J','t',']','X','d','z','z','r',';',';',';','7','7','7','f','l','e','e','e','+','+','@','@','@'}));
    }

    public static int compress(char[] chars) {
        int point = 0;

        for (int i = 0; i < chars.length; ++i) {
            Integer count = 1;

            for (int j = i + 1; j < chars.length; ++j) {
                if (chars[i] != chars[j]) {
                    break;
                }

                ++count;
                ++i;
            }

            chars[point++] = chars[i];

            if (count > 9) {
                String s = count.toString();
                for (int j = 0; j < s.length(); ++j) {
                    chars[point++] = s.charAt(j);
                }
            } else if (count > 1) {
                chars[point++] = (char) (count + '0'); //zero is 48
            }
        }

        return point;
    }
}