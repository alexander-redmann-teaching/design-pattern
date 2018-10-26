package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }
    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        Expression male = new TerminalExpression("male");
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(new AndExpression(robert, male), new AndExpression(john, male));
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(new String[]{"Julie", "married"}));
        System.out.println("John is female? " + isMale.interpret(new String[]{"John", "female"}));
        System.out.println("Robert is male? " + isMale.interpret(new String[]{"Robert", "male"}));
    }
}
