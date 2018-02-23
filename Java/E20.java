public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            }
            else if (brackets.containsValue(ch)) {
                if (stack.isEmpty() || brackets.get(stack.pop()) != ch) return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
