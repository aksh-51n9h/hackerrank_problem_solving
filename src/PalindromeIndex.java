import java.util.Scanner;

public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

        for (int i = 0; i < n; i++) {
            String s = in.nextLine();

            System.out.println(getIndex(s));
        }
    }


    public static int getIndex(String s) {
        int i = 0, j = s.length() - 1;
        boolean isPalin = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalin = false;
                break;
            }

            i++;
            j--;
        }

        if (isPalin) {
            return -1;
        }


        //remove at index i
        int x = i + 1;
        int y = j;
        isPalin = true;
        while (x < y) {
            if (s.charAt(x) != s.charAt(y)) {
                isPalin = false;
                break;
            }

            x++;
            y--;
        }

        if (isPalin) {
            return i;
        }


        //remove at index j
        x = i;
        y = j - 1;
        isPalin = true;
        while (x < y) {
            if (s.charAt(x) != s.charAt(y)) {
                isPalin = false;
                break;
            }

            x++;
            y--;
        }

        if (isPalin) {
            return j;
        }

        return -1;

    }
}