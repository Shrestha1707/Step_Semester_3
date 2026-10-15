import java.util.Arrays;

public class DutyRosterRotation {
    // Complexity: O(n) time, O(n) space for the result array.
    //
    // Rotating one place at a time, k times, costs O(n * k). With k up to 10^9 that is
    // about 10^11 operations, far too slow. Using k % n removes full turns, and
    // (i + k) % n puts every name in its final spot in a single pass.
    static String[] rotateRoster(String[] names, long k) {
        int n = names.length;
        int shift = (int) (k % n);
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = names[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names, 2))); // [D, E, A, B, C]
        System.out.println(Arrays.toString(rotateRoster(names, 7))); // [D, E, A, B, C]
    }
}