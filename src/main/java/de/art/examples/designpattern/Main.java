package de.art.examples.designpattern;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        EditorOriginator editor = new EditorOriginator();
        EditorCaretaker caretaker = new EditorCaretaker();
        editor.write("Hello");
        caretaker.push(editor.save());
        editor.write("Hello World");
        editor.write("Hello World!!!");
        caretaker.push(editor.save());
        editor.write("Foo Bar");
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
