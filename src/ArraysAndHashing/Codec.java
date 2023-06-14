package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
    final char DELIMITER = '#';
    String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append(DELIMITER);
            sb.append(str);
        }
        return sb.toString();
    }

    List<String> decode(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        List<String> strs = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();

            while (chars[i] != DELIMITER) {
                sb.append(chars[i]);
                i++;
            }
            i++;
            int numberOfCharacters = Integer.valueOf(sb.toString());
            int end = i + numberOfCharacters;
            sb = new StringBuilder();
            while (i < end) {
                sb.append(chars[i]);
                i++;
            }
            i--;
            strs.add(sb.toString());
        }
        return strs;
    }
    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> strs = Arrays.asList("Hello", "World","Codc");
        System.out.println(codec.encode(strs));
        System.out.println(codec.decode("5#Hello5#World4#Codc"));

    }
}
