package ArraysAndHashing;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();
        if (strs.length == 0) {
            System.out.println("Empty List of strings provided");
        }

        for (String str: strs) {
            ArrayList<String> arrList = null;
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String temp = String.valueOf(charArray);
            if (anagrams.containsKey(temp)) {
                arrList = anagrams.get(temp);
                arrList.add(str);
            }
            else {
                arrList = new ArrayList<String>();
                arrList.add(str);
            }
            anagrams.put(temp, arrList);
        }
        return new ArrayList<>(anagrams.values());
    }
    public static void main(String[] args) {
        String[] words = {"pop","bat","tab","opp"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> aList = groupAnagrams.groupAnagrams(words);
        System.out.println(aList);
    }
}
