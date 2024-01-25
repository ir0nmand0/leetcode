import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};
        int[] nums3 = {2, 1};
        int[] nums4 = {1, 0};
        int[] nums5 = {1,0,0};

        moveZeroes(nums1);
        moveZeroes(nums2);
        moveZeroes(nums3);
        moveZeroes(nums4);
        moveZeroes(nums5);

        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));
        System.out.println("nums3 = " + Arrays.toString(nums3));
        System.out.println("Arrays.toString(nums4) = " + Arrays.toString(nums4));
        System.out.println("Arrays.toString(nums5) = " + Arrays.toString(nums5));
    }

    public static void moveZeroes(int[] nums) {
        int noZeroIndex = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[noZeroIndex++] = nums[i];
            }
        }

        while (noZeroIndex < nums.length) {
            nums[noZeroIndex++] = 0;
        }
    }
}