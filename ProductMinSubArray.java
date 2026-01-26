public class ProductMinSubArray {

     public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left = 0;
        int p = 1;
        int c = 0;
        for (int r = 0; r < nums.length; r++) {
            p *= nums[r];
            while (p >= k) {
                p /= nums[left];
                left++;
            }
            c += r - left + 1;
        }
        return c;
    }

    public static void main(String[] args) {
        ProductMinSubArray p = new ProductMinSubArray();

        int nums[]={10,5,2,6};
        int k=100;

       int res= p.numSubarrayProductLessThanK(nums, k);
       System.out.println(res);
    }
}
