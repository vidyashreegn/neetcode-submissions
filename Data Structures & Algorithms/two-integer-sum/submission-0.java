class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for(int i= 0; i<nums.length; i++) {
            int difference = target - nums[i];
            if(numbers.containsKey(difference) && numbers.get(difference) != i) {
                return new int[]{i, numbers.get(difference)};
            }
        }

     return new int[0];
    }
}
