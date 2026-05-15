class Solution {
    public boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> charSeqs1 = new HashMap<>();
        HashMap<Character, Integer> charSeqs2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            charSeqs1.put(s1.charAt(i), charSeqs1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            charSeqs2.put(s2.charAt(i), charSeqs2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        return charSeqs1.equals(charSeqs2) ? true : false;
    

    }
}
