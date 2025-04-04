public class sortedarrayMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

               if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int half = (totalLength + 1) / 2;

        int left = 0;
        int right = m;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = half - i;

            int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                if (totalLength % 2 == 0) {
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                } else {
                    return Math.max(nums1Left, nums2Left);
                }
            } else if (nums1Left > nums2Right) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        sortedarrayMedian solution = new sortedarrayMedian();

        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median); 
        System.out.println("By Lokireddy Chakridhar Reddy (2022601278)");
    }
}
