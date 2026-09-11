package arrays.assigment_problems;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);
        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;
            if (prefixMap.containsKey(currentSum - k)) {
                count += prefixMap.get(currentSum - k);
            }
            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }
}