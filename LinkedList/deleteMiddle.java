// Delete the Middle Node of a Linked List

class Solution {
    public ListNode deleteMiddle(ListNode head) {
    
        if(head.next==null)
            return null;
        if(head.next.next==null)
        {
            head.next=null;
                return head;
        }
        
        ListNode curr=head;
        ListNode ans=head;
        
        while(curr!=null && curr.next!=null)
        {
            curr=curr.next.next;
            ans=ans.next;
        }
        
        // swaping value.
        ans.val=ans.next.val;
        ans.next=ans.next.next;
        
        return head;
    }
}
