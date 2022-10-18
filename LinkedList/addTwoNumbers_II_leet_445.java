//  Add Two Numbers (leetCode 445)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1=reverseList(l1);
        l2=reverseList(l2);
        
        ListNode l3=ADD_TwoNumbers(l1,l2);
        
        return reverseList(l3);
        
    }
    // function to reverse LinkedList
    public ListNode reverseList(ListNode head) {
        
        ListNode curr=head;
        ListNode previous=null;     
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=previous;
            previous=curr;  
            curr=temp;   
        }
        return previous;
    }
    // fucnction to add two LinkedList (same as leetCode Q.no 2).
    public ListNode ADD_TwoNumbers(ListNode l1, ListNode l2) {
        
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
