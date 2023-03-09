package external;

public class ValidBrackets {
    public static String showValidBrackets(String input) {
        String ans = "";
        int[] dp = new int[input.length()];
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (input.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && input.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
            }
        }
        int current = 0;
        for (int j = dp.length - 1; j >0; j--){
            if (current > 0) {
                current--;
            } else if (dp[j] > 0){
                ans = input.substring(j - dp[j] + 1,j + 1) + ans;
                current = dp[j];
            }
        }
        return  ans.length() > 0 ? ans.length() + " - " + ans : String.valueOf(ans.length());
    }
}
