package Stack;

import java.util.HashMap;
import java.util.Map;

public class NextGreatestEle {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greaterVal = new int[nums2.length];
        int[] res = new int[nums1.length];
        Map<Integer, Integer> uniqNum = new HashMap<>();
        greaterVal[0] = nums2[0];

        for(int i= 0; i<nums2.length; i++) {
            uniqNum.put(nums2[i], i);
            if (i > 0) {
                greaterVal[i] = Math.max(nums2[i], greaterVal[i - 1]);
            }
        }

        for(int i=0; i<nums1.length; i++) {
            if (uniqNum.containsKey(nums1[i])) {
                if (uniqNum.get(nums1[i]) < nums2.length - 1) {
                    if(greaterVal[i + 1] == nums1[i]) {
                        res[i] = -1;
                    } else {
                        res[i] = Math.max(greaterVal[i + 1], nums1[i]);
                    }
                } else {
                    res[i] = -1;
                }
            } else {
                res[i] = -1;
            }
        }

        return res;

    }
}
