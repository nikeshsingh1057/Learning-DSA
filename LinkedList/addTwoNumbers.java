// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head=new ListNode(-1);
        ListNode curr=head;
        int carry=0;
        
        // adding both element in new linklist.
        while(l1 !=null && l2 !=null)
        {
            int sum=l1.val+l2.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            
            l1=l1.next;
            l2=l2.next;
        }
        // adding left element in l1.
        while(l1!=null)
        {
            curr.next=new ListNode((l1.val+carry)%10);
            curr=curr.next;
            carry=(l1.val+carry)/10;
            l1=l1.next;
        }
        // adding left element in l2
        while(l2!=null)
        {
            curr.next=new ListNode((l2.val+carry)%10);
            curr=curr.next;
            carry=(l2.val+carry)/10;
            l2=l2.next;
        }
        // adding left carry.
        if(carry!=0)
        {
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
        return head.next;
    }
}
