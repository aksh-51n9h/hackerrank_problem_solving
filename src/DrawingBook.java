import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int p = in.nextInt();

        System.out.println(pageCount(n,p));
    }

    public static int pageCount(int n, int p) {
        return (int)Math.min(Math.floor(p/2), Math.floor(n/2-p/2));
    }

}
