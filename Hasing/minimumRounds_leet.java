//  Minimum Rounds to Complete All Tasks leet 2244

public int minimumRounds(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int elem :arr){
        if(map.containsKey(elem)){
            map.put(elem,map.get(elem)+1);
        }else{
            map.put(elem,1);
        }
    }
     int count = 0 ;
    for(int elem :map.keySet()){
        int val = map.get(elem);
        
        if(val<2){
            return -1;
        }
        if(val ==2 || val ==3){
            count+=1;
        }
        if(val >3){
            int rem = val%3;
            int quot = val/3;
            count = rem>0 ? count+quot+1:count+quot;
        }
    }
    return count ;
}
