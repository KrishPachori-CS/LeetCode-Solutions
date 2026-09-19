public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();

        while(head != null){
            if(seen.contains(head)){
                return head;
            }
            seen.add(head);
            head = head.next;
        }
        return null;
    }
}