class Solution {
    
    public int candy(int[] ratings) {
    
        int n = ratings.length;   // is rating is sorted then answer is sum of all indexes+1. 1,4,6,7

        int ans = 0;
    
        int[] le = new int[n]; // left
        int[] re = new int[n]; // right
    
        Arrays.fill(le, 1);    // sabko initially one candy de diye hai. so we fill it with 1.
        Arrays.fill(re, 1);

        for (int i = 1; i < n; ++i)
            if (ratings[i] > ratings[i - 1])
                le[i] = le[i - 1] + 1;

        for (int i = n - 2; i >= 0; --i)
            if (ratings[i] > ratings[i + 1])
                re[i] = re[i + 1] + 1;

        for (int i = 0; i < n; ++i)
            ans += Math.max(le[i], re[i]);

        return ans;
    }
}
// checking left and right 
//        12 4 3 11 34 34 1 67
// le=>    1 1 1  2  3  3  1 2
// re=>    3 2 1  1  1  2  1  1
