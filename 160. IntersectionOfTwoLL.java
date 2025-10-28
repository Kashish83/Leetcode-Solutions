class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
 
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=getLength(headA);
        int lenB=getLength(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
         while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB= headB.next;
        }
        return headA;
    }
    private int getLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;

        }
        return len;
    }
}
