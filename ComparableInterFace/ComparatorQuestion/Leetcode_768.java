// K-th Smallest Prime Fraction _ 768

class Solution { // seen
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new CustomComparator());

        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                pq.add(new int[]{arr[i],arr[j]});
            }
        }

        while(!pq.isEmpty() && k > 1)
        {
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}

class CustomComparator implements Comparator<int[]> {
 
    @Override
    public int compare(int[] number1, int[] number2) {
        double value =  ((double)number2[0]/number2[1] - (double)number1[0]/number1[1]);
       
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
