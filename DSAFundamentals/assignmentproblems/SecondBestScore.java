public class SecondBestScore {
    // Complexity: O(n) time, O(1) space (single pass, no sorting).
    // Sorting first would be O(n log n) time, which is slower and not allowed here.
    static int secondHighest(int[] scores) {
        int highest = -1, second = -1; // scores are >= 0, so -1 means "not found"
        for (int s : scores) {
            if (s > highest) {
                second = highest;
                highest = s;
            } else if (s < highest && s > second) {
                second = s; // a score equal to highest is skipped
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondHighest(new int[]{45, 78, 92, 78, 60})); // 78
        System.out.println(secondHighest(new int[]{50, 50, 50}));         // -1
    }
}