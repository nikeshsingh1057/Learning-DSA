// Merge In Between Linked Lists (leetcode_1669)


class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode curr=list1;
        int i=1;
        while(i<a)
        {
            curr=curr.next;
            i++;
        }
        
        int j=i;
        ListNode curr2=curr;
        while(j<=b+1 && curr2!=null)
        {
            curr2=curr2.next;
            j++;
        }
        
        ListNode tem=list2;
        while(tem.next!=null)
        {
            tem=tem.next;
        }
        curr.next=list2;  //joining of two linklist.
        tem.next=curr2;  
        
        return list1;
    }
}
