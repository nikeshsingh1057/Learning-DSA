// 2178. Maximum Split of Positive Even Integers

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
    
        List<Long> ll=new ArrayList<>();
        
        if(finalSum%2==1)
            return ll;
        
        long i=2l;
        
        // we basically reducing value with samllest even digit and also taking care of dublicate.
        // we do not take dublicate. i.e for 4 ans is 4 but in list it add 2 and finalsum contain 2 so
        // at last we add remaining finalsum in the last value of list so that no dublicate aries.
        while(i<=finalSum)
        {
            ll.add(i);
            finalSum-=i;
            i+=2;
        }
        
        int id=ll.size()-1; // index of last position of list
        
        ll.set(id,ll.get(id)+finalSum); // here we adding remaining finalsum in the last of list element
        
        return ll;
    }
}
