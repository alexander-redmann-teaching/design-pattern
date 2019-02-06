package de.art.examples.designpattern;

public class EditorOriginator {

    //state
    public String editorContent;

    public void write(String contents) {
        this.editorContent = contents;
    }

    public EditorMemento save() {
        return new EditorMemento(editorContent);
    }

    public void restoreToState(EditorMemento memento) {
        editorContent = memento.getSavedState();
    }

    public void print() {
        System.out.println("print: " + editorContent);
    }
}
