package Graph;

public class NumOfIslands {
    int r;
    int c;
    int[][] directions;
    public int numIslands(char[][] grid) {
         r = grid.length;
         c = grid[0].length;
        int count = 0;
        directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};

        for(int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(grid[i][j] == '1') {
                     dfs(grid, i, j);
                     ++count;
                }
            }
        }
        // if needed reset val to 1 -you can differentiate between 1/2
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if(i < 0 || j< 0 || i >= r || j >= c || grid[i][j] == '0' || grid[i][j] == '2' ) {
            return;
        }
        grid[i][j] = '2';
        for (int[] dir : directions) {
            dfs(grid, i + dir[0], j + dir[1]);
        }
    }
}
