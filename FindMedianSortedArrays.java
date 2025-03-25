public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(double[] nums1, double[] nums2) {
        double[] newArr = new double[nums1.length + nums2.length];
        int counter = 0;
        for (double v : nums1) {
            newArr[counter++] = v;
        }
        for(int count = 0; count < nums2.length; count++) {
            newArr[nums1.length + count] = nums2[count];
        }

        double[] sortingArr = new double[newArr.length];
        for(int count = 0; count < newArr.length; count++) {
            int temp = 0;
            double min = Integer.MAX_VALUE;
            for (int inner = 0; inner < newArr.length; inner++) {
                if (newArr[inner] < min) {
                    min = newArr[inner];
                    temp = inner;

                }
            }
            sortingArr[count] = min;
            newArr[temp] = Integer.MAX_VALUE;

        }
        double median;
        if (sortingArr.length % 2 != 0) {
            median = (int) sortingArr[sortingArr.length / 2];
        } else {
            int first = (int) sortingArr[sortingArr.length / 2];
            int second = (int) sortingArr[sortingArr.length / 2 - 1];
            median = (double) (first + second) / 2;


        }
        return median;
    }

    public static void main(String[]  args) {
        double[] nums1 = {1,2};

        double[] nums2 = {3,4};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
//        System.out.println(Arrays.toString(result));
    }
}
