package de.art.examples.designpattern;

public class EditorMemento {

    private final String editorState;
    public EditorMemento(String state) {
        editorState = state;
    }
    public String getSavedState() {
        return editorState;
    }
}
