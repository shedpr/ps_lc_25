package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    int r, c;

    public void wallsAndGates(int[][] rooms) {
        /**
         * iterate on rooms -
         * for each time you get a gate (0) start bfs
         * for each coordinate find min from possible gates
         * key here is - assign value of neighbor = curr postion + 1
         */


        int m = rooms.length;
        int n = m == 0 ? 0 : rooms[0].length;
        int[][] dirs = {{-1,0}, {0,1}, {0,-1}, {1,0}};

        Queue<int[]> queue = new LinkedList<>();
        // add all gates to the queue
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new int[] {i,j});
                }
            }
        }
        // update distance from gates
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            for (int[] dir : dirs) {
                int x = curPos[0] + dir[0];
                int y = curPos[1] + dir[1];
                if (x < 0 || y < 0 || x >= m || y >= n || rooms[x][y] != Integer.MAX_VALUE)
                    continue;
                rooms[x][y] = rooms[curPos[0]][curPos[1]] + 1;
                queue.offer(new int[]{x, y});
            }
        }}}
