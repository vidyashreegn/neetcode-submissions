class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> anagramsGroup = new HashMap<>();

        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            anagramsGroup.putIfAbsent(key, new ArrayList<>());
            anagramsGroup.get(key).add(s);
        }
        return new ArrayList<>(anagramsGroup.values());
    }
}
