public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int passed = 0;
        int total = 0;
        
        // Test 1: Example from problem statement
        total++;
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = solution.maxArea(height1);
        if (result1 == 49) {
            System.out.println("✓ Test 1 passed: Basic example");
            passed++;
        } else {
            System.out.println("✗ Test 1 failed: Expected 49, got " + result1);
        }
        
        // Test 2: Minimum case - two elements
        total++;
        int[] height2 = {1, 1};
        int result2 = solution.maxArea(height2);
        if (result2 == 1) {
            System.out.println("✓ Test 2 passed: Minimum case");
            passed++;
        } else {
            System.out.println("✗ Test 2 failed: Expected 1, got " + result2);
        }
        
        // Test 3: Increasing heights
        total++;
        int[] height3 = {1, 2, 3, 4, 5};
        int result3 = solution.maxArea(height3);
        if (result3 == 6) {
            System.out.println("✓ Test 3 passed: Increasing heights");
            passed++;
        } else {
            System.out.println("✗ Test 3 failed: Expected 6, got " + result3);
        }
        
        // Test 4: Decreasing heights
        total++;
        int[] height4 = {5, 4, 3, 2, 1};
        int result4 = solution.maxArea(height4);
        if (result4 == 6) {
            System.out.println("✓ Test 4 passed: Decreasing heights");
            passed++;
        } else {
            System.out.println("✗ Test 4 failed: Expected 6, got " + result4);
        }
        
        // Test 5: Same heights
        total++;
        int[] height5 = {5, 5, 5, 5};
        int result5 = solution.maxArea(height5);
        if (result5 == 15) {
            System.out.println("✓ Test 5 passed: Same heights");
            passed++;
        } else {
            System.out.println("✗ Test 5 failed: Expected 15, got " + result5);
        }
        
        // Test 6: Large difference
        total++;
        int[] height6 = {1, 10000, 1, 1, 1};
        int result6 = solution.maxArea(height6);
        if (result6 == 4) {
            System.out.println("✓ Test 6 passed: Large height difference");
            passed++;
        } else {
            System.out.println("✗ Test 6 failed: Expected 4, got " + result6);
        }
        
        // Test 7: Zero height
        total++;
        int[] height7 = {0, 2, 0};
        int result7 = solution.maxArea(height7);
        if (result7 == 0) {
            System.out.println("✓ Test 7 passed: Zero height");
            passed++;
        } else {
            System.out.println("✗ Test 7 failed: Expected 0, got " + result7);
        }
        
        // Summary
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Results: " + passed + "/" + total + " tests passed");
        if (passed == total) {
            System.out.println("🎉 All tests passed!");
        } else {
            System.out.println("⚠️  Some tests failed. Keep trying!");
        }
    }
}
