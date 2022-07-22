import java.util.ArrayList;

public class RemoveConsecutiveRedundantNumbers {
    static void removeRedundant(ArrayList<Integer> numList) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(numList.get(0));
        for(int i = 1; i < numList.size(); i++) {
            if(numList.get(i) != numList.get(i-1)) {
                newList.add(numList.get(i));
            }
        }
        System.out.println(newList);

//        for(int i = 0; i < newList.size(); i++) {
//            System.out.println(newList.get(i));
//        }
    }
    public static void main(String[] args) {
        int num[] = { 10,34,23,45,45,10,4,4,2,2,3,2 };
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for(int i = 0; i < num.length; i++) {
            aList.add(num[i]);
        }
        removeRedundant(aList);
    }
}
