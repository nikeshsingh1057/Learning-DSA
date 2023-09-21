// https://leetcode.com/problems/merge-k-sorted-lists/
// leetcode_23

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new sorting()); // isme we can pass dirctly lamda sorting expression same working hai bas code chotta ho jayea.
        
        for(ListNode ll: lists){
            if(ll!=null){
                pq.add(ll);
            }
        }
        ListNode Dummy=new ListNode();
        ListNode temp=Dummy;
        while(!pq.isEmpty()){
            
            ListNode rv=pq.poll();
            Dummy.next=rv;
            Dummy=Dummy.next;
            
            if(rv.next!=null){
                pq.add(rv.next);
            }
        }
        return temp.next;
    }
}
public class sorting implements Comparator<ListNode>{
    
    public int compare(ListNode o1,ListNode o2){
                return o1.val-o2.val;
    }
}
/*--------------------------------------------------------------------------------------------------------------------------------------*/

/* note iss question me hum comparator interface use kiye hai sort karne ke liye and we also know that ki comparator use karne ke  new class
me usko implements karna hota hai . jaise upper use kiye hai.
now hum comprable bhee use kar sakte thee bass hume ListNode ke class me Comparable ko implement karna hota aur compareTo method ko override
then comprable see bhee PriorityQueue sort ho jata note Comparable interface ko same class me implement karna hota hai jisme object wager 
banaye hai jaise yaha ListNode me implement karna hoga. */

public class ListNode Comparable<ListNode>{    // ListNode me linked list ka node wagera create ho raha hai i.e sorting linkedlist value.
    int val;
    ListNode next;
    
    ListNode() {           // ye tino Constructor hai.
    }              
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
    
    public int compareTo(ListNode st) {     // yaha hum compare karwa rahe hai..
        return this.val-st.val;
    }
    public String toString() {  
		return this.data+" ";
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>();
        
        for(ListNode ll: lists){
            if(ll!=null){
                pq.add(ll);
            }
        }
        ListNode Dummy=new ListNode();
        ListNode temp=Dummy;
        while(!pq.isEmpty()){
            
            ListNode rv=pq.poll();
            Dummy.next=rv;
            Dummy=Dummy.next;
            
            if(rv.next!=null){
                pq.add(rv.next);
            }
        }
        return temp.next;
    }
}
