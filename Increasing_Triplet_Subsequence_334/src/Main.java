import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {5,4,3,2,1};
        int[] nums3 = {2,1,5,0,4,6};

        System.out.println("increasingTriplet(nums1) = " + increasingTriplet(nums1));
        System.out.println("increasingTriplet(nums2) = " + increasingTriplet(nums2));
        System.out.println("increasingTriplet(nums3) = " + increasingTriplet(nums3));

    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        
        int num1 = Integer.MAX_VALUE;
        int num2 = num1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= num1) {
                num1 = nums[i];
            } else if (nums[i] <= num2) {
                num2 = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}