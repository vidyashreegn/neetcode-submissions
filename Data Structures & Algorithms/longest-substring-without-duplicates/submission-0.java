class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        HashSet<Character> chars = new HashSet<>();
        int l=0;

        for(int i=0;i<s.length();i++) {
            while(chars.contains(s.charAt(i))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(i));
            res=Math.max(res, chars.size());
        }
        return res;
    }
}
