package Graph;

import javax.crypto.Cipher;
import java.util.LinkedList;
import java.util.Queue;

public class RottingFruit {
    int r, c, freshCount, fin = -1;
    int[][] direction;
    Queue<int[]> queue = new LinkedList();
    public int orangesRotting(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        direction = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(grid[i][j] ==2) {
                    queue.offer(new int[]{i,j});
                }
                else if (grid[i][j] == 1) {
                    ++freshCount;
                }
            }
        }

        while (freshCount > 0 || !queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int[] temp = queue.poll();
                for (int[] d : direction) {
                    int rItr = d[0] + temp[0];
                    int cItr = d[1] + temp[1];
                    if (rItr < 0 || cItr < 0 || rItr >= r || cItr >= c || grid[rItr][cItr] == 0 || grid[rItr][cItr] == 2) {
                        continue;
                    }
                    grid[rItr][cItr] = 2;
                    queue.add(new int[]{rItr, cItr});
                    --freshCount;
                }
            }
            ++fin;
        }

        return freshCount == 0 ? fin : -1;

    }
}
