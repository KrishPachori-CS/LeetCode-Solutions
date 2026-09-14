class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        int start = 0;

        int[] freq = new int[fruits.length];

        for (int end = 0; end < fruits.length; end++) {
            int eFruit = fruits[end];

            if (freq[eFruit] == 0) {
                max++;
            }
            freq[eFruit]++;

            while (max > 2) {
                int lFruit = fruits[left];

                freq[lFruit]--;

                if (freq[lFruit] == 0) {
                    max--;
                }

                left++;
            }

            start = Math.max(start, end - left + 1);
        }

        return start;
    }
}