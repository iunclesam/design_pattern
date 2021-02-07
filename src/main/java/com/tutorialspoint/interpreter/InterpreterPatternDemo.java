package com.tutorialspoint.interpreter;

/**
 * Interpreter pattern provides a way to evaluate language grammar or expression.
 * This type of pattern comes under behavioral pattern.
 * This pattern involves implementing an expression interface which tells to interpret a particular context.
 * This pattern is used in SQL parsing, symbol processing engine etc.
 *
 * See <a href='https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm'>Interpreter Pattern</a>
 */
public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
