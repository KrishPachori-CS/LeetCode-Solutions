class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        boolean x = r1[0] < r2[2] && r2[0] < r1[2];
        boolean y = r1[1] < r2[3] && r2[1] < r1[3];

        return x&&y;
    }
}