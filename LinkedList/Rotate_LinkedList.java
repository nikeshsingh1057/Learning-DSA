// Rotate Linklist similar to rotate array. (leetcode_61)

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
            return head;
        
        ListNode curr=head;
        int len=0;
        while(curr!=null)
        {
            len++;   // calculating length;
            curr=curr.next;
        }
        k=k%len;
        if(k==0) // since no rotation will occur.
            return head;
        
        ListNode temp=head;
        int i=1;
        while(i<len-k)
        {
            temp=temp.next;     //finding the node where we have to rotate.
            i++;
        }
        
        ListNode new_head=temp.next;  //making new node to kth place node.
        temp.next=null;
        
        ListNode temp2=new_head;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
        temp2.next=head;     //connecting to the first node.
        
        return new_head;
    }
}
