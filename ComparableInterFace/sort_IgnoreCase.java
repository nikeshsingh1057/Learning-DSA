import java.util.Arrays;

public class sort_IgnoreCase {
    public static void main(String[] args) {
        
        String [] arr={"gfg","id","GFG","Apple","apple"};
        Arrays.sort(arr,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arr));
    }
}
