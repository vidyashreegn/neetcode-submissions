class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(char c:s.toCharArray()){
            if(stack.size()!=0 && closeToOpen.containsKey(c)) {
                if(stack.peek() == closeToOpen.get(c)){
                    stack.pop();
                }else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
