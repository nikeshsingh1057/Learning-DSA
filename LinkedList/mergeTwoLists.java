// Merge Two Sorted Lists  (same as maximum sum path in two sorted array.) Leetcode_21.


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head=new ListNode(-1);
        ListNode curr=head;
        
        while(list1 !=null && list2 !=null)
        {
            if(list1.val==list2.val)
            {
                curr.next=new ListNode(list1.val);
                curr=curr.next;
                
                curr.next=new ListNode(list2.val);
                curr=curr.next;
                
                list1=list1.next;
                list2=list2.next;
            }
            else if(list1.val<list2.val)
            {
                curr.next=new ListNode(list1.val);
                curr=curr.next;
                list1=list1.next;
            }
            else
            {
                curr.next=new ListNode(list2.val);
                curr=curr.next;
                list2=list2.next;
            }
        }
        while(list1!=null)
        {
            curr.next=new ListNode(list1.val);
            curr=curr.next;
            list1=list1.next;
        }
        
        while(list2!=null)
        {
            curr.next=new ListNode(list2.val);
            curr=curr.next;
            list2=list2.next;
        }
        return head.next;
    }
}
