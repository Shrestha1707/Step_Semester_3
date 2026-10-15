public class BusiestBusRow {
    // Complexity: O(r * c) time, O(1) additional space.
    // The best row is updated only on a strictly larger total, so ties keep the smaller index.
    static String busiestRow(int[][] grid) {
        int bestRow = 0, bestTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int total = 0;
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
            }
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }
        return "Row " + bestRow + ", Total " + bestTotal;
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        System.out.println(busiestRow(grid)); // Row 1, Total 7
    }
}