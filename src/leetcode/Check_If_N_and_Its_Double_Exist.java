package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Check_If_N_and_Its_Double_Exist {
//    public static boolean checkIfExist(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++) {
//            for(int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j] * 2 || arr[j] == 2 * arr[i])
//                    return true;
//            }
//        }
//        return false;
//    }

    //    Cach 2.
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, 12, -20, -8, 15};
        System.out.println(checkIfExist(nums));
    }
}
