import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        do {
            int n = in.nextInt();
            int k = in.nextInt();

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (in.nextInt() > 0) {
                    count++;
                }
            }

            System.out.println((n-count) < k ? "YES" : "NO");
        } while (--t != 0);
    }
}
