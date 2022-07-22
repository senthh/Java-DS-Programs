public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int num[] = {0,0,1,1,1,2,2,3,3,4};
        int k;
        System.out.println(removeDuplicates(num));
    }
    static int removeDuplicates(int[] num) {
        int j = 0;
        for(int i = 0; i < num.length-1; i++) {
            if(num[i] != num[i+1]) {
                num[j] = num[i];
                j++;
            }
        }
        num[j] = num[num.length-1];
        j++;
        return j;
    }
}
