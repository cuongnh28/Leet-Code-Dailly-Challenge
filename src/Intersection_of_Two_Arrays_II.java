import java.util.HashMap;
import java.util.Map;

public class Intersection_of_Two_Arrays_II {

    public static int[] intersect(int[] nums1, int[] nums2) {
//        int n1 = nums1.length,
//            n2 = nums2.length,
//            k = 0;
//        int[] intersectNums = new int[Math.min(n1, n2)];
//
//        if (n1 <= n2) {
//            k = intersectNums(nums1, nums2, intersectNums);
//        }
//        else {
//            k = intersectNums(nums2, nums1, intersectNums);
//        }
//        int[] res = new int[k];
//        for (int i = 0; i < k; i++)
//            res[i] = intersectNums[i];
//        return res;

//        Cach 2.
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int val : nums1) {
            m.put(val, m.getOrDefault(val, 0) + 1);
        }
        int k = 0;
        for (int val : nums2) {
            if (m.getOrDefault(val, 0) > 0) {
                nums1[k++] = val;
                m.put(val, m.get(val) - 1);
            }
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = nums1[i];
        }
        return ans;
    }

    public static int intersectNums (int[] nums1, int[] nums2, int[] intersectNums) {
        int n1 = nums1.length,
            n2 = nums2.length,
            k = 0;
        boolean[] isVisited = new boolean[n2];
        for (int i = 0; i < n1; i++) {
            intersectNums[i] = -1;
        }
        for (int i = 0; i < n2; i++) {
            isVisited[i] = false;
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j] && !isVisited[j]) {
                    intersectNums[k++] = nums1[i];
                    isVisited[j] = true;
                    break;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5, 5},
                nums2 = new int[]{9,4,9,8,4};
        int[] res = intersect(nums1, nums2);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }

}
