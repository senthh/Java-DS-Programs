package ArraysAndHashing;

import java.util.HashMap;

public class ContainsDuplicate {
    boolean containsDuplicate(int numbers[] ) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return true;
            }
            map.put(numbers[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = {1,3,1,8};
        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate(numbers));
    }
}
