import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int idx = in.nextInt();
            arr[idx] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(arr[arr[i]]);
        }
    }
}
