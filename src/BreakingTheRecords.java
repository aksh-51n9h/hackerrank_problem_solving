import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int low = scores.get(0);
        int high = scores.get(0);

        int max = 0, min = 0;

        int i = 1;
        while (i < scores.size()) {
            int score = scores.get(i++);

            if (score > high) {
                max++;
                high = score;
            } else if (score < low) {
                min++;
                low = score;
            }
        }

        List<Integer> res = new ArrayList<Integer>();
        res.add(max);
        res.add(min);

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = BreakingTheRecords.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
