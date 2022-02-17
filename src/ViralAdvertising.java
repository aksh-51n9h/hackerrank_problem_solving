import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int prevLikes = 2;
        int sum = prevLikes;

        for (int i = 2; i <= n; i++) {
            prevLikes = (prevLikes*3)/2;
            sum += prevLikes;
        }

        System.out.println(sum);
    }
}
