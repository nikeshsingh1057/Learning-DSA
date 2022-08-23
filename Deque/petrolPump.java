import java.util.*;

/* 
 *  first circular tour / gas station leet code 134
 */
public class petrolPump {
    public static void main(String[] args) {

        int gas[] = { 8, 9, 4 };
        int cost[] = { 5, 10, 12 };

        System.out.println(FirstPetrolPump(gas, cost));
    }

    static int FirstPetrolPump(int[] gas, int[] cost) {

        int curr = 0;
        int count = 0, len = 0;
        int i = 0;
        while (i < gas.length) {
            curr += gas[i] - cost[i];

            if (curr >= 0) {
                len++; /* agar len, Array length ke equal ho jaye to ture hoga */

                i = (i + 1) % gas.length;

                if (len == gas.length)
                    return i;
            }

            else {
                curr = 0;
                len = 0;
                count++; /* agar count , Array length ke equal ho jaye to false hoga */
                if (count == gas.length) {
                    return -1;
                }
                i = (i + 1) % gas.length; /* increase circurly */
            }

        }
        return -1;

    }

}
