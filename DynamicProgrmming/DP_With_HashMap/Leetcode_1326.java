// https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/
//  Minimum Number of Taps to Open to Water a Garden

class Solution {

    private Map<String, Integer> dp;
    public int minTaps(int n, int[] ranges) {

        dp=new HashMap<>();

        int interval[][]=new int[ranges.length][2];
        for(int i=0; i<ranges.length; i++) {

            int r[]=new int[2];
            r[0]=i-ranges[i];
            r[1]=i+ranges[i];
            interval[i]= r;
        }

        Arrays.sort(interval, (a, b)->a[0]-b[0]);

        int ret =util(n, interval, 0, 0);

        return ret >= Integer.MAX_VALUE-1 ? -1 : ret;
    }

    private int util(int n, int interval[][], int cur, int i) {
        
        if(cur>=n) {
            return 0;
        }
        if(i==interval.length) {
            return Integer.MAX_VALUE-1;
        }

        String key=cur+"nik"+i;
        if(dp.containsKey(key)) return dp.get(key);

        int ret = Integer.MAX_VALUE-1;
        
        if(interval[i][0] > cur) return Integer.MAX_VALUE-1;

        int take= 1+ util(n, interval, interval[i][1], i+1);
        int notTake= util(n, interval, cur, i+1);

        ret = Math.min(take, notTake);
        
        dp.put(key, ret);
        return ret;
    }
}

// this question is similar to leetcode 1024 .
