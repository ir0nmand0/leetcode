public class Main {
    public static void main(String[] args) {
        System.out.println("pivotIndex(new int[]{1,7,3,6,5,6}) = " + pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println("pivotIndex(new int[]{1,2,3}) = " + pivotIndex(new int[]{1,2,3}));
        System.out.println("pivotIndex(new int[]{2,1,-1}) = " + pivotIndex(new int[]{2,1,-1}));
        System.out.println("pivotIndex(new int[]{-1,-1,-1,-1,-1,0}) = " + pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
        System.out.println("pivotIndex(new int[]{-1,-1,0,0,-1,-1}) = " + pivotIndex(new int[]{-1,-1,0,0,-1,-1}));
        System.out.println("pivotIndex(new int[]{-1,-1,0,1,0,-1}) = " + pivotIndex(new int[]{-1,-1,0,1,0,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; ++i) {
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length; ++i) {
            rightSum -= nums[i];

            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}