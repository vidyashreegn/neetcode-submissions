class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveSet = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            consecutiveSet.add(nums[i]);
        }
        int longest = 0;

        for(int num: nums) {
            int length = 0;
            if(!consecutiveSet.contains(num - 1)) {
                while(consecutiveSet.contains(num + length)) {
                    length = length + 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
