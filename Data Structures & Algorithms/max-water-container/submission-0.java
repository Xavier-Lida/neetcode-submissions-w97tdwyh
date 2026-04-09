class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxHeight = 0;

        while (l < r) {
            int leftColumn = heights[l];
            int rightColumn = heights[r];
            int height = Math.min(leftColumn, rightColumn) * (r - l);
            if (leftColumn > rightColumn) {
                r--;
            } else {
                l++;
            }

            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }
}
