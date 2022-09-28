//leet code 19

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int length=0;
        
        ListNode curr=head;
        
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        
        if(n==length)
            return head.next;
        
        ListNode temp=head;
        for(int i=0;i<length-n-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
