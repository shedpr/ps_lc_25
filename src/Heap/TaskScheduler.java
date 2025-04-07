package Heap;

import java.util.Arrays;

public class TaskScheduler {
    /**
     * find max frequency (this will need to be placed the most times)
     * find idle time = gap * each slot
     * iterate through input to fid if there are enough characters to fill the gaps
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int[] freqTask = new int[26];
        for (char c : tasks) {
            freqTask[c - 'A']++;
        }
        Arrays.sort(freqTask);
        int maxFreq = freqTask[25] -1;

        int idleSlot = maxFreq * n;

        for (int j = 24; j >= 0; j--) {
            idleSlot -= Math.min(freqTask[j], maxFreq);
        }

        return idleSlot > 0 ? idleSlot + tasks.length : tasks.length;

        }
    }
