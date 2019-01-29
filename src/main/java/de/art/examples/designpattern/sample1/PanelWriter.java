package de.art.examples.designpattern.sample1;

public class PanelWriter {
    public void printPanel(String content) {
        System.out.println("-------------------------");
        System.out.println("|\t\t" + content + "\t\t|");
        System.out.println("|                       |");

    }

    public void printBottomLine() {
        System.out.println("-------------------------");
    }
}
