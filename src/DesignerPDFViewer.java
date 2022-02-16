import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] heights = new int[26];

        for (int i = 0; i < 26; i++) {
            heights[i] = in.nextInt();
        }

        in.nextLine();

        String w = in.nextLine();

        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < w.length(); i++) {
            int idx = (w.charAt(i) - 97);

            if (heights[idx] > maxHeight) {
                maxHeight = heights[idx];
            }
        }

        System.out.println(maxHeight * w.length());
    }
}
