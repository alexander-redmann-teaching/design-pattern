package de.art.examples.designpattern;

import de.art.examples.designpattern.sample1.PanelWriter;
import de.art.examples.designpattern.sample2.ButtonWriter;
import de.art.examples.designpattern.sample2.InputReader;

public class DialogFacade {
    private final PanelWriter panelWriter = new PanelWriter();
    private final ButtonWriter buttonWriter = new ButtonWriter();
    private final InputReader inputReader = new InputReader();

    public boolean showPanel(String content) {
        panelWriter.printPanel(content);
        buttonWriter.drawButtons();
        panelWriter.printBottomLine();
        return inputReader.readClickInput();
    }
}
