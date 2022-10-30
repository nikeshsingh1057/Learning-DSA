// Split Linked List in Parts (Leetcode_725)

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode arr[]=new ListNode[k];
        int count=0;
        ListNode curr=head;
        
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        
        // if length is smaller than k.
        if(count<k)
        {
            for(int i=0;i<k;i++)
            {
                 if(head!=null)
                 {
                     ListNode temp=head.next;
                     arr[i]=head;
                     head.next=null;
                     head=temp;
                 }
            }
            return arr;
        }
        // if length is greater than k.
        else{
            
        int div=count/k;  // to store quotient.
        int rem=count%k;  // to store remender.
        
        for(int i=0;i<k;i++)
        {
            int temp=div;
            if(rem>0)
            {
                temp+=1;
                rem--;   // quotient me remender add kar ke bheje hai
            }
            arr[i]=head;
            
            head=split(head,temp);
        }
        return arr;
            
        }
        
    }
    public static ListNode split(ListNode curr,int div) // here div=jaha tak split karna hai.
    {
        int i=1;
        while(i<div)
        {
            curr=curr.next;
            i++;
        }
        ListNode temp=curr.next;
        curr.next=null; // we make null because hame yahi tak ka node chaiye.
        return temp;
    }
}
