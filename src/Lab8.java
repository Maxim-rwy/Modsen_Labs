import java.util.Stack;

class Lab8 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Lab8 solution = new Lab8();
        System.out.println(solution.isValid("()"));       // Ожидаемый вывод: true
        System.out.println(solution.isValid("()[]{}"));   // Ожидаемый вывод: true
        System.out.println(solution.isValid("(]"));       // Ожидаемый вывод: false
        System.out.println(solution.isValid("([])"));     // Ожидаемый вывод: true
    }
}

