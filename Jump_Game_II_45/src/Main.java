public class Main {
    public static void main(String[] args) {
        System.out.println("canJump(new int[]{2,3,1,1,4}) = " + canJump(new int[]{2,3,1,1,4}));
        System.out.println("canJump(new int[]{3,2,1,0,4}) = " + canJump(new int[]{2,3,0,1,4}));
        System.out.println("canJump(new int[]{3,2,1}) = " + canJump(new int[]{3,2,1}));
        System.out.println("canJump(new int[]{1,2,1,1,1}) = " + canJump(new int[]{1,2,1,1,1}));
        System.out.println("canJump(new int[]{1,2,3}) = " + canJump(new int[]{1,2,3}));
        System.out.println("canJump(new int[]{1,2}) = " + canJump(new int[]{1,2}));
        System.out.println("canJump(new int[]{1,1,1,1}) = " + canJump(new int[]{1,1,1,1}));
    }

    public static int canJump(int[] nums) {

        int ans = 0;
        int end = 0;
        int farthest = 0;

        // Implicit BFS
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }

            if (i == end) {
                ++ans;
                end = farthest;
            }
        }

        return ans;
    }
}