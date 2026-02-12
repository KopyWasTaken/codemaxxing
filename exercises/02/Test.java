public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int passed = 0;
        int total = 0;
        
        // Test 1: Standard list of 5 elements
        total++;
        ListNode list1 = Solution.createList(new int[]{1, 2, 3, 4, 5});
        ListNode reversed1 = solution.reverseList(list1);
        String result1 = Solution.listToString(reversed1);
        if (result1.equals("[5,4,3,2,1]")) {
            System.out.println("✓ Test 1 passed: List of 5 elements");
            passed++;
        } else {
            System.out.println("✗ Test 1 failed: Expected [5,4,3,2,1], got " + result1);
        }
        
        // Test 2: List of 2 elements
        total++;
        ListNode list2 = Solution.createList(new int[]{1, 2});
        ListNode reversed2 = solution.reverseList(list2);
        String result2 = Solution.listToString(reversed2);
        if (result2.equals("[2,1]")) {
            System.out.println("✓ Test 2 passed: List of 2 elements");
            passed++;
        } else {
            System.out.println("✗ Test 2 failed: Expected [2,1], got " + result2);
        }
        
        // Test 3: Empty list
        total++;
        ListNode list3 = Solution.createList(new int[]{});
        ListNode reversed3 = solution.reverseList(list3);
        String result3 = Solution.listToString(reversed3);
        if (result3.equals("[]")) {
            System.out.println("✓ Test 3 passed: Empty list");
            passed++;
        } else {
            System.out.println("✗ Test 3 failed: Expected [], got " + result3);
        }
        
        // Test 4: Single element
        total++;
        ListNode list4 = Solution.createList(new int[]{42});
        ListNode reversed4 = solution.reverseList(list4);
        String result4 = Solution.listToString(reversed4);
        if (result4.equals("[42]")) {
            System.out.println("✓ Test 4 passed: Single element");
            passed++;
        } else {
            System.out.println("✗ Test 4 failed: Expected [42], got " + result4);
        }
        
        // Test 5: List with negative numbers
        total++;
        ListNode list5 = Solution.createList(new int[]{-3, -1, 0, 2, 4});
        ListNode reversed5 = solution.reverseList(list5);
        String result5 = Solution.listToString(reversed5);
        if (result5.equals("[4,2,0,-1,-3]")) {
            System.out.println("✓ Test 5 passed: Negative numbers");
            passed++;
        } else {
            System.out.println("✗ Test 5 failed: Expected [4,2,0,-1,-3], got " + result5);
        }
        
        // Test 6: List with duplicates
        total++;
        ListNode list6 = Solution.createList(new int[]{1, 1, 1, 1});
        ListNode reversed6 = solution.reverseList(list6);
        String result6 = Solution.listToString(reversed6);
        if (result6.equals("[1,1,1,1]")) {
            System.out.println("✓ Test 6 passed: Duplicate values");
            passed++;
        } else {
            System.out.println("✗ Test 6 failed: Expected [1,1,1,1], got " + result6);
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
