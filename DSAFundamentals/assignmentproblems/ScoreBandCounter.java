public class ScoreBandCounter {
    // Complexity: linear scan is O(n) time, O(1) space.
    // Binary search is O(log n) time, O(1) space.
    //
    // Duplicates: a normal binary search stops at ANY match, which may be in the middle
    // of a run of equal scores. So we search for boundaries instead: the first index with
    // score >= low and the first index with score > high. Their difference counts every
    // duplicate at both edges of the band.

    static int firstAtLeast(int[] a, int target) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] >= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    static int firstGreaterThan(int[] a, int target) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    static int countInBand(int[] scores, int low, int high) {
        return firstGreaterThan(scores, high) - firstAtLeast(scores, low);
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));   // 6
        System.out.println(countInBand(scores, 90, 100));  // 0
    }
}