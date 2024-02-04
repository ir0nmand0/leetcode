import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println("Arrays.toString() = " + Arrays.toString(arr));
    }

    public static void reverse(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k < 0 ? k + nums.length : k % nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}