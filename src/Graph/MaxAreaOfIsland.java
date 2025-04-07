package Graph;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int ans = 0;

        for(int i=0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans = Math.max(ans, dfs(grid, i , j));
            }
        }

        return ans;
    }

    private int dfs(int[][] grid, int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        return 1 + dfs(grid, r+1,c) + dfs(grid, r-1, c) + dfs(grid, r, c-1) + dfs(grid, r, c+1);
    }
}
