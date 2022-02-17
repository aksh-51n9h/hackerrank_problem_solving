import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] map = new int[n];

        for (int i = 0; i < n; i++) {
            map[(i + k) % n] = i;
        }

        for (int i = 0; i < q; i++) {
            int idx = in.nextInt();
            System.out.println(arr[map[idx]]);
        }
    }
}
