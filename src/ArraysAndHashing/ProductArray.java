package ArraysAndHashing;

import java.util.Arrays;

public class ProductArray {
    int[] productSimple(int[] nums) {
        int total = 1;
        int len = nums.length;
        int num_zero = 0;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                num_zero++;
            }
            else {
                total = total*nums[i];
            }
        }

        for(int i = 0; i < len; i++) {
            if (num_zero == 1) {
                if (nums[i] == 0) {
                    ans[i] = total;
                }
                else {
                    ans[i] = 0;
                }
            }
            if (num_zero == 0) {
                ans[i] = total/nums[i];
            }
        }

        return ans;
    }

    int[] productPreSuf(int[] nums) {
        int len = nums.length;
        int curr = 1;
        int[] res = new int[len];

        Arrays.fill(res,1);

        for(int i = 0; i < len; i++) {
            res[i] = res[i] * curr;
            curr = curr * nums[i];
        }
        curr = 1;
        for(int i = len-1; i >= 0; i--) {
            res[i] = res[i] * curr;
            curr = curr * nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        ProductArray productArray = new ProductArray();
        int nums[] = {1,2,3,4,4};
        // int result[] = productArray.productSimple(nums);
        int result[] = productArray.productPreSuf(nums);
        for (int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println("+++++++++++++++");
/**
        result = productArray.productSimple(nums);
        for (int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }
 */
    }
}
