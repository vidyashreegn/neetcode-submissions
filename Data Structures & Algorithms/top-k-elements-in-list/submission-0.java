class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for(int num : nums) {
            count.put(num , count.getOrDefault(num, 0) + 1);
        }
        
        for(int i=0 ; i<= nums.length ; i++) {
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int j = 0;
        for(int i = freq.length-1; i>0 && j<k; i--) {
            List<Integer> val = freq[i];
            if(val.size()>0) {
                for(int p=0 ; p<val.size();p++) {
                    res[j] = val.get(p);
                    j++;
                }
            }
        }
            return res;
    }
}
