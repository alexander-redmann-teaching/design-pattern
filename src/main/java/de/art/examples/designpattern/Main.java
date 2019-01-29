package de.art.examples.designpattern;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Image image = new ProxyImage(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/HelloWorld.svg/320px-HelloWorld.svg.png"));
//        Image image = new RealImage(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/HelloWorld.svg/320px-HelloWorld.svg.png"));
        System.out.println("Created Image");
        image.displayImage();
        image.displayImage();
        image.displayImage();

    }
}
