// find top k frequent element in array.

// https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1    (gfg)
// https://leetcode.com/problems/top-k-frequent-elements/                       (leetcode_347)

// method 1st using pair class

class Solution {  // using pair class and pq.
    
    public int[] topKFrequent(int[] arr, int k) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        
        PriorityQueue<pair> pq=new PriorityQueue<>();
        
        
        for(int key:hs.keySet()){
            
            pq.add(new pair(key,hs.get(key)));
            
            if(pq.size()>k){    // removing the extra element which not need in answer.
                pq.poll();
            }
        }
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().num;
        }
       
        return ans;
    }
    
}
class pair implements Comparable<pair>{
    
    int num,count;
    pair(int num,int count){
        
        this.num=num;
        this.count=count;
    }
    public int compareTo(pair b){   // sort a/c to frq on number.
        return this.count-b.count;
    }
}

/*----------------------------------------------------------------------------------------------------------------------------------------*/
// method 2 without pair class

class Solution {
    
    public int[] topKFrequent(int[] arr, int k) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hs.get(a)-hs.get(b));
        
        
        for(int key:hs.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        Arrays.sort(ans);
        return ans;
    }
}
