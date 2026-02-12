public class Solution {
    /**
     * Finds the maximum area of water that can be contained.
     * 
     * Approach: Use two pointers starting from both ends.
     * The area is limited by the shorter line. Move the pointer
     * at the shorter line inward to potentially find a taller line.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param height array of line heights
     * @return maximum area of water that can be contained
     */
    public int maxArea(int[] height) {
        // init the two pointers 
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxArea = 0;
        // iterate until the pointers contact each other
        while (leftPointer < rightPointer) {
            int leftHeight = height[leftPointer];
            int rightHeight = height[rightPointer];
            int cappedHeight = Math.min(height[leftPointer], height[rightPointer]);
            int xDiff = Math.abs(rightPointer - leftPointer);
            int area = cappedHeight * xDiff;

            if (area > maxArea) maxArea = area;

            if (leftHeight < rightHeight) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }


        return maxArea;
    }
    
    // Main method for manual testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test 1: " + sol.maxArea(height1)); // Expected: 49
        
        // Test case 2
        int[] height2 = {1, 1};
        System.out.println("Test 2: " + sol.maxArea(height2)); // Expected: 1
    }
}
