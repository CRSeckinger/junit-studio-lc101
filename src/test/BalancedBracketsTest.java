package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWIthTextInTheMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsStartInTheMiddleOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAtTheBeginningOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketAtTheBeginning() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void textClosedBracketTextOpenBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void openBracketNoClose() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closeBracketOpenBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void openNestedBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }


}
