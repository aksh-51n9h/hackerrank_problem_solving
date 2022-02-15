import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxCount = Integer.MIN_VALUE;

        int[] freq = new int[101];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                continue;
            }

            if (freq[i] + freq[i + 1] > maxCount) {
                maxCount = freq[i] + freq[i + 1];
            }
        }

        System.out.println(maxCount);
    }
}
