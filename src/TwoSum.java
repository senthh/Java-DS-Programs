import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int num[] = {1,3,4,5,10};
        int result[] = twoSum(num, 9);
        for(int i =0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    static int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for(int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if(sumMap.containsKey(complement)) {
                return new int[] { sumMap.get(complement), i };
            }
            sumMap.put(num[i], i);
        }
        return null;
    }
}
