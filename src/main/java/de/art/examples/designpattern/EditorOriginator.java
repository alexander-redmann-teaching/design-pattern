package de.art.examples.designpattern;

public class EditorOriginator {

    //state
    public String editorContents;

    public void setState(String contents) {
        this.editorContents = contents;
    }

    public EditorMemento save() {
        return new EditorMemento(editorContents);
    }

    public void restoreToState(EditorMemento memento) {
        editorContents = memento.getSavedState();
    }

    public void print() {
        System.out.println("print: " + editorContents);
    }
}
