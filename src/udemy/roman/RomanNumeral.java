package udemy.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<String, Integer> table;

    public RomanNumeral() {
        table = new HashMap<String, Integer>();
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
    }

    public int convert(String roman) {
        int res = 0;

        for (int i = 0; i < roman.length(); i++) {
            int right = nextRoman(roman, i);
            int current = table.get(Character.toString(roman.charAt(i)));

            if (right > current) {
                current *= -1;
            }

            res += current;
        }

        return res;
    }

    private int nextRoman(String roman, int i) {
        int right = 0;
        if (i < roman.length()-1) {
            String rightRoman = roman.substring(i+1, i+2);
            right = table.get(rightRoman);
        }
        return right;
    }
}
