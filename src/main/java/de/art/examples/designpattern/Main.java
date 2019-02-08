package de.art.examples.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {


    public static void main(String[] args) {
        CeilingFanPullChainClassic ceilingFan = new CeilingFanPullChainClassic();
//        CeilingFanPullChainContext ceilingFan = new CeilingFanPullChainContext();
        while (true) {
            System.out.print("Press ENTER");
            waitForEnter();
            ceilingFan.pullChain();

        }
    }

    private static void waitForEnter() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
