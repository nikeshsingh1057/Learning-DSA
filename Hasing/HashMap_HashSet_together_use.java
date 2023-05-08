// https://leetcode.com/problems/find-the-distinct-difference-array/

class Solution
{
    public int[] distinctDifferenceArray(int[] nums)
    {
        int l = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0; i<l; i++)
            m.put(nums[i],1+m.getOrDefault(nums[i],0));

        HashSet<Integer> h = new HashSet<>();

        int [] r = new int[l];
        int x;

        for(int i=0; i<l; i++)
        {
            h.add(nums[i]);

            x = m.get(nums[i]);

            if(x==1)
                m.remove(nums[i]);

            else
                m.put(nums[i],x-1);

            r[i] = h.size()-m.size();
        }

        return r;
    }
}
