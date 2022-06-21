

//binary search using recursion.
public class recursion1 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 35, 67, 89, 90, 91, 99, 106, 125, 500, 570 };
        int target = 5;
        int s = 0, e = arr.length - 1;
        System.out.println(Binarysearch(arr, target, s, e));
    }

    public static boolean Binarysearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            System.out.println(1);// check point. kitne barr iske andar aaya.
            int m = s + (e - s) / 2;
            if (arr[m] == target)
                return true;
            else if (target < arr[m])
                return Binarysearch(arr, target, s, m - 1);
            else
                return Binarysearch(arr, target, m + 1, e);

        }
        return false;
    }
}
