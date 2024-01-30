public class Main {
    public static void main(String[] args) {
        System.out.println("largestAltitude(new int[]{-5,1,5,0,-7}) = " + largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println("largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}) = " + largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
        System.out.println("largestAltitude(new int[]{-59,-27,-7,-24,69,80,-22,-53}) = " + largestAltitude(new int[]{-59,-27,-7,-24,69,80,-22,-53}));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; ++i) {
            currentAltitude += gain[i];

            if (currentAltitude > max) {
                max = currentAltitude;
            }
        }

        return max;
    }
}