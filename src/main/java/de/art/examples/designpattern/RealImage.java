package de.art.examples.designpattern;

import java.net.URL;

public class RealImage implements Image {
    private String imageData;

    public RealImage(URL url) {
        imageData = loadImage(url);
    }

    public void displayImage() {       //display the image
        System.out.println("Render: " + imageData);
    }

    //a method that only the real image has
    private String loadImage(URL url) {
        //do resource intensive operation to load image
        System.out.println("Download image from : " + url);
        return url.getPath();
    }
}
