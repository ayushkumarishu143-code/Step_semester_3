package arrays_and_methods.assigment_problems;

public class MatchDayGridAnalyzer {
    private static double rowAverage(int[] row) {
        if (row.length == 0) return 0.0;
        int sum = 0;
        for (int val : row) sum += val;
        return (double) sum / row.length;
    }

    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);
            String classification = (avg >= threshold) ? "Power Surge" : "Normal";
            sb.append("Match ").append(i).append(": ").append(classification);
            if (i < runsPerOver.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] runs = {{4, 6, 8}, {10, 12, 14}, {2, 3, 1}};
        System.out.println(classifyMatches(runs, 8));
    }
}