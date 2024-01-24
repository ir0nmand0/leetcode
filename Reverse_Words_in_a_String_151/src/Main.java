public class Main {
    public static void main(String[] args) {
        String s = "the sky is blue";
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = s.split(" ");

        int start = 0;
        int end = arr.length - 1;

        while (start < end && arr[start].isEmpty()) {
            ++start;
        }

        while (start < end && arr[end].isEmpty()) {
            --end;
        }

        for (int i = end; i >= start; --i) {
            if (arr[i].isEmpty()) {
                continue;
            }

            stringBuilder.append(arr[i]);

            if (i > start) {
                stringBuilder.append(" ");
            }
        }

        System.out.println("stringBuilder = " + stringBuilder.toString() + '"');
    }
}