package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        EditorOriginator editor = new EditorOriginator();
        EditorCaretaker caretaker = new EditorCaretaker();
        editor.setState("1");
        caretaker.push(editor.save());
        editor.setState("2");
        editor.setState("3");
        caretaker.push(editor.save());
        editor.setState("4");
        editor.print();
        System.out.println("Undo");
        editor.restoreToState(caretaker.pop());
        editor.print();
        editor.restoreToState(caretaker.pop());
        editor.print();
        editor.restoreToState(caretaker.pop());
        editor.print();
    }
}
