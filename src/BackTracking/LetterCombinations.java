package BackTracking;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 *
 * Input: digits = ""
 * Output: []
 * Example 3:
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 *
 * Constraints:
 *
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinations {
    Map<Integer, CharArray> dec_let_map;

    void letterCombinations(int dec[]) {
        for (int i = 0; i < dec.length; i++) {
            System.out.print(dec[i] + " ");
        }
    }
    public static void main(String[] args) {
        int dec[] = {2,3};
        LetterCombinations lc = new LetterCombinations();
        /**
        lc.dec_let_map = new HashMap<>();
        CharArray alp = new CharArray();
        //alp.
        lc.dec_let_map.put(2, alp);
        */
        lc.letterCombinations(dec);
    }
}
