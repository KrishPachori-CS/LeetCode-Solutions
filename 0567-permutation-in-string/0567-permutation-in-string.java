import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int window = s1.length();

        if (s2.length() < s1.length()) {
            return false;
        }

        int[] sArr = new int[26];
        int[] pArr = new int[26];

        for (int i = 0; i < window; i++) {
            int si = s2.charAt(i) - 'a';
            int pi = s1.charAt(i) - 'a';

            sArr[si]++;
            pArr[pi]++;
        }

        if (Arrays.equals(pArr, sArr)) {
            return true;
        }

        for (int i = 1; i <= s2.length() - s1.length(); i++) {

            int remove = s2.charAt(i - 1) - 'a';
            int add = s2.charAt(i + s1.length() - 1) - 'a';

            sArr[remove]--;
            sArr[add]++;

            if (Arrays.equals(pArr, sArr)) {
                return true;
            }
        }

        return false;
    }
}