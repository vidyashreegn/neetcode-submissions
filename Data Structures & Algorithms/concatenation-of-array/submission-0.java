class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] output = new int[nums.length * 2];
        for(int k=0; k<n; k++) {
            output[k] = output[k+n] = nums[k];
        }
        return output; 
    }
}