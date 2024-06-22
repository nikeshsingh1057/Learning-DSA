// https://leetcode.com/problems/count-number-of-nice-subarrays/
// Count Number of Nice Subarrays_1248

/*This problem can simply be converted to the problem ->  Method 1st.

Finding the number of SubArrays with Sum K
So to achieve this, simply convert all the even numbers to 0 and all the odd ones to 1.
Now, the array is reduced to elements containing 0's and 1's only.
Now, we apply the concept of prefixSum, and also store the prefixSum upto every index in a hash map.

So whenever we encounter :-

1. PrefixSum == k -> We increment the count by 1
2. PrefixSum > k -> We check if subarray with sum = (PrefixSum-k) exists, if it does the we simply add its count value
Then we simply add the current prefixSum to the Map

Complexity
Time complexity:
O(n)
Space complexity:
O(n)
Code 
  */
class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int n = nums.size();

        for(int i=0;i<n;i++) {
            if(nums[i]%2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }

        int prefixSum = 0;
        int count = 0;
        unordered_map<int,int> mp;

        for(int i=0;i<n;i++) {
            prefixSum += nums[i];

            if(prefixSum == k)
                count++;

            int rem = prefixSum - k;
            if(mp.find(rem) != mp.end()) {
                count += mp[rem];
            }

            mp[prefixSum]++;
        }

        return count;
    }
};

// method 2 atmost(k)-atmost(k-1) sliding window.

class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        
        return Atmost(arr,k)-Atmost(arr,k-1);
        
        // similar question subarray with k distint integers. 
    }
    public static int Atmost(int [] arr,int k)
    {
        int count=0,i=0,j=0,ans=0;
        
        while(i<arr.length)
        {
            if((arr[i] & 1)==1)
                count++;     

            while(count>k)     
            {
                if((arr[j] & 1)==1)
                    count--;          
                j++; 
            }
            ans+=i-j+1;
            i++;
        }
        return ans;
    }
}

// method 3rd using sliding window + queue

class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        
        Queue<Integer> oddIndices = new LinkedList<>(); // store only 0 and 1.
        
        int subarrays = 0;   //to store answer.
        int lastPopped = -1;

        for (int i = 0; i < nums.length; i++) {
            
            // If element is odd, append its index to the list.
            if (nums[i] % 2 == 1) 
                oddIndices.offer(i);
            
            // If the number of odd numbers exceeds k, remove the first odd index.
            if (oddIndices.size() > k) 
                lastPopped = oddIndices.poll();
            
            // If there are exactly k odd numbers, add the number of even numbers
            // in the beginning of the subarray to the result.
            if (oddIndices.size() == k) {
                int initialGap = oddIndices.peek() - lastPopped;
                subarrays += initialGap;
            }
        }

        return subarrays;
    }
}
