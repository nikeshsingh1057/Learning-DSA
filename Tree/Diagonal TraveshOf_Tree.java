// Diagonal Traveshal of Tree. (gfg)

// method 1st using iterative method.
class Tree {

    public static ArrayList <Integer> diagonalSum(Node root) 
    {
          ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                while (temp != null) {  // hum sirf right-right me move karenge and left ko store karawa lenge. and next level par fir se right right move karenge.
                    sum += temp.data;
                    if (temp.left != null)
                        q.add(temp.left);
                    temp = temp.right;
                }
            }
            ans.add(sum);
        }
        return ans;
    }
}

// using recursive method

class Tree {
    public static void diagonalSumUtil(Node root, int diagonal, Map<Integer, Integer> map)
    {
        if (root == null) 
            return;
      
        map.put(diagonal, map.getOrDefault(diagonal, 0) + root.data);

        // vertical distance remains same for right child 
        diagonalSumUtil(root.right, diagonal, map);       // no change in diagonal because right me hume sum add karna hai.

        // increase the vertical distance if left child 
        diagonalSumUtil(root.left, diagonal + 1, map);    // left me eak level diagonal increase kar de rahe hai so that sahi position mil jaye
    }

    // Function to print the diagonal sum of given binary tree
    public static ArrayList <Integer> diagonalSum(Node root)
    {
        ArrayList <Integer> res = new ArrayList <Integer> (0);   // for stroing answer.
        Map<Integer, Integer> map = new HashMap<>();
        diagonalSumUtil(root, 0, map);
      
        for (Integer key : map.values())    // adding in arrayList 
            res.add(key);
        return res;
    }
}
