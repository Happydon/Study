package external;

import org.junit.Test;

import static external.ValidBrackets.showValidBrackets;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidBracketsTest {

    @Test
    public void showValidBracketsCase1() {
        String input = "(()";
        String result = showValidBrackets(input);
        String expect = "2 - ()";
        assertThat(result, is(expect));
    }

    @Test
    public void showValidBracketsCase2() {
        String input = ")()())";
        String result = showValidBrackets(input);
        String expect = "4 - ()()";
        assertThat(result, is(expect));
    }

    @Test
    public void showValidBracketsCase3() {
        String input = ")(()())";
        String result = showValidBrackets(input);
        String expect = "6 - (()())";
        assertThat(result, is(expect));
    }

    @Test
    public void showValidBracketsCase4() {
        String input = ")(";
        String result = showValidBrackets(input);
        String expect = "0";
        assertThat(result, is(expect));
    }

    @Test
    public void showValidBracketsCase5() {
        String input = "()(()(((())";
        String result = showValidBrackets(input);
        String expect = "8 - ()()(())";
        assertThat(result, is(expect));
    }
    @Test
    public void showValidBracketsCase6() {
        String input = "(())))())()";
        String result = showValidBrackets(input);
        String expect = "8 - (())()()";
        assertThat(result, is(expect));
    }
}
