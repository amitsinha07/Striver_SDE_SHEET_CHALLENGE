public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow)
                break;
        }
        
        if(fast == null || fast.next == null){
            return null;
        }
        
        ListNode ptr1 = head, ptr2 = slow;
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr2;
    }
}
