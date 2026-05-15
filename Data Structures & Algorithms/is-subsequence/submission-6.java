class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j = 0;
        if(t.length() == 0 || s.length() > t.length()) {
            return false;
        }
        if(s.length() == 0) {
            return true;
        }
        while(j < t.length()) {
            if(t.charAt(j) == s.charAt(i)) {
                i++;
            } 
            j++;
            if(i == s.length()) break;
        }
        return (i == s.length()) ? true : false;
        
    }
}