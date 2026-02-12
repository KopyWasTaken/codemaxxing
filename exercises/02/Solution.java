class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    /**
     * Reverses a singly linked list.
     * 
     * Approach: Use three pointers (prev, current, next) to
     * reverse the links between nodes iteratively.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param head the head of the linked list
     * @return the head of the reversed list
     */
    public ListNode reverseList(ListNode head) {

    }
    
    // Helper method to create a list from array (for testing)
    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    // Helper method to convert list to string (for testing)
    public static String listToString(ListNode head) {
        if (head == null) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;
        
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        
        sb.append("]");
        return sb.toString();
    }
    
    // Main method for manual testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        ListNode list1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original: " + listToString(list1));
        ListNode reversed1 = sol.reverseList(list1);
        System.out.println("Reversed: " + listToString(reversed1));
        
        // Test case 2
        ListNode list2 = createList(new int[]{1, 2});
        System.out.println("\nOriginal: " + listToString(list2));
        ListNode reversed2 = sol.reverseList(list2);
        System.out.println("Reversed: " + listToString(reversed2));
    }
}
