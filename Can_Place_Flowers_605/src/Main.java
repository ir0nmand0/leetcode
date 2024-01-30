public class Main {
    public static void main(String[] args) {
        System.out.println("canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1) = "
                + canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println("canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1) = "
                + canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println("canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2) = " + canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1 && n == 1) {
            return flowerbed[0] == 0;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            --n;
        }

        if (n == 0) {
            return true;
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            --n;
        }

        if (n == 0) {
            return true;
        }

        for (int i = 2; i < flowerbed.length; ++i) {
            if (flowerbed[i - 2] == 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i - 1] = 1;
                --n;
            }
        }

        return n <= 0;
    }
}