class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0, k = 0;
        int[] arr = new int[n + m];

        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                arr[k++] = nums1[p1++];
            } else {
                arr[k++] = nums2[p2++];
            }
        }

        while (p1 < m) {
            arr[k++] = nums1[p1++];
        }

        while (p2 < n) {
            arr[k++] = nums2[p2++];
        }

        for (int i = 0; i < n + m; i++) {
            nums1[i] = arr[i];
        }
    }
}
