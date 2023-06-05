package ArraysAndHashing;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    boolean isAnagram(String str1, String str2) {
        HashMap<String, char[]> anagramMap = new HashMap<String, char[]>();
        char arr1[] = str1.toCharArray();
        Arrays.sort(arr1);
        String tmp = new String(arr1);
        System.out.println("Sorted String : " + tmp);
        /**
        if (!anagramMap.containsKey(str1)) {
            anagramMap.put(str1, arr1);
        }
         */
        if (!tmp.equals(str2)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.print(anagram.isAnagram("cat", "bat"));
    }
}
