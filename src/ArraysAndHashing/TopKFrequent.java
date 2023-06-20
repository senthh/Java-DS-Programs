package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequent {

    int[] topKFrequent(int[] numbers, int k) {
        int[] res = new int[k];
        int len = numbers.length;
        Map<Integer, Integer> num_count = new HashMap<Integer, Integer>();
        for (int num : numbers) {
            int count = num_count.getOrDefault(num,0) +1;
            num_count.put(num,count);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
