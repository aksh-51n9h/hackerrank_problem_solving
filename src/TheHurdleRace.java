import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();

            if(t>max){
                max =t;
            }
        }

        System.out.println(Math.max(max - k, 0));

    }
}
