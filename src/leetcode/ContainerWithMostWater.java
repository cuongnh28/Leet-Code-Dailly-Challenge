package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0,
            right = height.length - 1,
            maxArea = 0;
        while (left < right) {
            int heightLeft = height[left];
            int heightRight = height[right];
            int h = Math.min(heightLeft, heightRight);
            int w = right - left;
            int currentArea = h * w;
            if (heightLeft < heightRight) {
                left++;
            }
            else if (heightLeft > heightRight) {
                right--;
            }
            else {
                left++;
                right--;
            }
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }
}
