class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int totalLen = m + n;
        
        // Pointers for nums1 and nums2
        int i = 0, j = 0; 
        // Variables to track the two potential middle values
        int m1 = 0, m2 = 0; 

        // Iterate up to the middle of the combined lengths
        for (int count = 0; count <= totalLen / 2; count++) {
            m2 = m1; // Store previous value
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }

        // If total length is odd, return middle element
        if (totalLen % 2 != 0) {
            return m1;
        }
        // If even, return the average of the two middle elements
        return (m1 + m2) / 2.0;

    }
}