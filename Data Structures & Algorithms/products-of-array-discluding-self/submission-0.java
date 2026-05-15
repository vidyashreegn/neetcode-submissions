class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postFix = 1;
        int i = 0;
        int[] res = new int[nums.length];
        for(int num : nums) {
            res[i++] = prefix;
            prefix *= num;
        }
        
        for(int j=nums.length-1 ; j >= 0 ; j--) {
            res[j] = res[j] * postFix;
            postFix = postFix * nums[j];
        }
        return res;
    }
}  
