// https://practice.geeksforgeeks.org/problems/maximum-sum-combination/1
// Maximum sum Combination (vvi question we use both hashset and priorityQueue ).

class Solution {
    static List<Integer> maxCombinations(int n, int k, int arr1[], int arr2[]) {
        
        List<Integer> ll=new ArrayList<>();
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.sum-a.sum);
        HashSet<String> hs=new HashSet<>();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=n-1; // for a index
        int j=n-1; // for b index
        pq.add(new pair(arr1[i]+arr2[j],i,j)); // last ka index and sum dal diya hu.
        hs.add(i+" "+j);
        
        for(int z=0;z<k;z++){     // k tak chalayenge since we nee k combination sum
            
            pair p=pq.poll();     // poping from ProrityQueue.
            ll.add(p.sum);
            i=p.i-1;              // indexes hai.
            j=p.j;
            
            // for arr1[i-1][b]  cross bhee check karenge.
            if(i>=0 && j>=0 && !hs.contains(i+" "+j)){
                pq.add(new pair(arr1[i]+arr2[j],i,j));
                hs.add(i+" "+j);
            }
            
            // for arr1[i][j-1] yaha bee wahi karnege.
            i=p.i;
            j=p.j-1;
            
            if(i>=0 && j>=0 && !hs.contains(i+" "+j)){
                pq.add(new pair(arr1[i]+arr2[j],i,j));
                hs.add(i+" "+j);
            }
        }
        return ll;
    }
}
class pair{
    
    int sum;
    int i;
    int j;
    pair(int sum,int i,int j){
        this.sum=sum;
        this.i=i;
        this.j=j;
    }
}
