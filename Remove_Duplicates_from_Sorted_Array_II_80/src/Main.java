import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("removeDuplicates(new int[]{1,1,1,2,2,3}) = " + removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println("removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}) = "
                + removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
        System.out.println("removeDuplicates(new int[]{1,1,1,1}) = " + removeDuplicates(new int[]{1,1,1,1}));
        System.out.println("removeDuplicates(new int[]{1,1,1,1,3,3}) = " + removeDuplicates(new int[]{1,1,1,1,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                ++count;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[index++] = nums[i];
            }
        }

        return index;

    }
}