import java.util.Stack;

class Lab9 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Lab9 solution = new Lab9();
        System.out.println("Output: " + solution.longestValidParentheses("(()"));
        System.out.println("Output: " + solution.longestValidParentheses(")()())"));
        System.out.println("Output: " + solution.longestValidParentheses(""));
    }
}
