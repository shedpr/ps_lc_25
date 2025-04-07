package ArrayHashing;

import java.util.HashMap;
import java.util.Map;

public class ProductOfSparseMap {
    Map<Integer, Integer> maps;

    ProductOfSparseMap(int[] nums) {
        maps = new HashMap();
        for(int i : nums) {
            if(i != 0) {
                maps.put(i, nums[i]);
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(ProductOfSparseMap vec) {
        Map<Integer, Integer> vecMap = vec.maps;
        Map<Integer, Integer> thisMap = this.maps;
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : thisMap.entrySet()) {
            if(vecMap.containsKey(entry.getKey())) {
                sum += vecMap.get(entry.getKey()) * thisMap.get(entry.getKey());
            }
        }

        return sum;
    }
}
