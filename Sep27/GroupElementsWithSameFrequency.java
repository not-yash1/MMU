package Sep27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupElementsWithSameFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 4, 4};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 1) {
                result.add(Arrays.asList(key, freqMap.get(key)));
            }
        }
        System.out.println(result);
    }
    
}
