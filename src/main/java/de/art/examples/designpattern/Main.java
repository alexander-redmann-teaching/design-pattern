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

    private static void testSentence(String sentence, Expression expression) {
        System.out.println(sentence + "? : " + expression.interpret(sentence.split(" ")));
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        testSentence("Julie is a married women", getMarriedWomanExpression());
        testSentence("John is female", getMaleExpression());
        testSentence("Robert is male", getMaleExpression());
    }
}
