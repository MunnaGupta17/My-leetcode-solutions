class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean found = true;
        int time = 0;

        while (found) {
            found = false;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (grid[i][j] == 2) {

                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            found = true;
                            grid[i - 1][j] = 3;
                        }

                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            found = true;
                            grid[i][j - 1] = 3;
                        }

                        if (i + 1 < m && grid[i + 1][j] == 1) {
                            found = true;
                            grid[i + 1][j] = 3;
                        }

                        if (j + 1 < n && grid[i][j + 1] == 1) {
                            found = true;
                            grid[i][j + 1] = 3;
                        }
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 3) {
                        grid[i][j] = 2;
                    }
                }
            }

            if (found) {
                time++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }
}