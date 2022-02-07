import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            arr[i++] = in.nextInt();
        }
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(int[] arr) {
        int max = getMax(arr);

        int[] freq = new int[max + 1];

        for (int j : arr) {
            freq[j]++;
        }

        int maxFreq = getMax(freq);

        int id = Integer.MAX_VALUE;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq && i < id) {
                id = i;
            }
        }

        return id;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }
}
