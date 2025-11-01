class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        ListNode prev=null;
        while(head!=null && head.next!=null){
            ListNode first=head;
            ListNode second=head.next;
            first.next=second.next;
            second.next=first;
            if(prev!=null){
                prev.next=second;
            }
            prev=first;
            head=first.next;
        }
        return newHead;
        
    }
}
