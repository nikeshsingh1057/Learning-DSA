// 23. Merge k Sorted Lists

// method 1 using comparable class->
/* this will not work on leetcode because hum leetcode ke linkedlist implementation ko modify nahi kar sakte hai so ye work nahi karega leetcode
  par but out side compiler par work karega */

public class ListNode implements Comparable<ListNode>{   
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
		return this.val+" ";
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

// method 2nd using comparator (this will work on leetcode )

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {   // linked list ka head diya hoga sirf i.e only first node address.
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
        
            public int compare(ListNode o1,ListNode o2){
                return o1.val-o2.val;
            }
        });
        
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
