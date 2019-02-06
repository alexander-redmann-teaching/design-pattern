package de.art.examples.designpattern;

import java.util.Stack;

public class EditorCaretaker {
    private Stack<EditorMemento> stack = new Stack<EditorMemento>();

    public void push(EditorMemento memento) {
        stack.push(memento);
    }

    public EditorMemento pop() {
        if(stack.isEmpty()) {
            return new EditorMemento("");
        }
        return stack.pop();
    }
}
