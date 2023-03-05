package external;

import java.util.Stack;

public class ValidBrackets {
    public static String showValidBrackets(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        int lastSymbol = 0;
        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                    lastSymbol = i + 1 ;
                }
            }
        return ans != 0? ans + " - " + input.substring(lastSymbol - ans ,lastSymbol) : String.valueOf(ans);
    }
}
