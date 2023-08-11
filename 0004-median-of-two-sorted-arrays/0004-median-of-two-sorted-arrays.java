import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        int idx = nums1.length;

        for (int i = 0; i < nums1.length; i++) {
            sum[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            sum[idx++] = nums2[j];
        } 

        Arrays.sort(sum);

        int sumLength = sum.length;

        return sumLength % 2 == 0 ? (sum[sumLength / 2] + sum[sumLength / 2 - 1]) / 2.0 : sum[sumLength / 2]; 
    }
}