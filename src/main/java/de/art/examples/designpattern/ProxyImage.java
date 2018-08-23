package de.art.examples.designpattern;

import java.net.URL;

public class ProxyImage implements Image {
    private URL url;
    private RealImage realImage;
    private long displayCount = 0;

    public ProxyImage(URL url) {
        this.url = url;
    }

    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }

        displayCount++;
        realImage.displayImage();
        System.out.println("Log: " + displayCount);
    }
}
