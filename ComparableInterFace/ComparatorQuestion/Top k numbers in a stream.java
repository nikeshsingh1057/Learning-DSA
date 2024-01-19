// Top k numbers in a stream
// https://www.geeksforgeeks.org/problems/top-k-numbers3425/1

// method 1st using pair class.

class pair{
    int num;
    int freq;
    pair(int n,int f)
    {
        num=n;
        freq=f;
    }
}

class Solution {     // seen
    
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int n, int k) {
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:arr)
        {
            ArrayList<Integer> a=new ArrayList<>();
            map.put(i,map.getOrDefault(i,0)+1);
            
            PriorityQueue<pair> pq=new PriorityQueue<>((x,y)->{
                if(x.freq==y.freq)
                    return x.num-y.num;
                return y.freq-x.freq;
            });
            
            for(int key:map.keySet())
                pq.add(new pair(key,map.get(key)));
            
            int c=0;
            while(!pq.isEmpty())
            {
                if(c<k)
                {
                    a.add(pq.peek().num);
                    c++;
                }
                pq.poll();
            }
            list.add(a);
        }
        return list;
    }
}

// method 2nd using lamda expression ----------------------------------------------------------------------------------------------------

class Solution {     // seen
    
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int n, int k) {
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:arr)
        {
            ArrayList<Integer> a=new ArrayList<>();
            map.put(i,map.getOrDefault(i,0)+1);
            
            PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->{
                if(map.get(x) == map.get(y))
                    return x - y;
                return map.get(y) - map.get(x);
            });
            
            for(int key:map.keySet())
                pq.add(key);
            
            int c=0;
            while(!pq.isEmpty())
            {
                if(c<k)
                {
                    a.add(pq.peek());
                    c++;
                }
                pq.poll();
            }
            list.add(a);
        }
        return list;
    }
}
