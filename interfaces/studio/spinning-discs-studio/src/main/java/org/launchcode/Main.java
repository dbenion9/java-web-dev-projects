package org.launchcode;

public class Main {
    public static void main(String[] args) {
        OpticalDisc cd = new CD();
        OpticalDisc dvd = new DVD();

        // Testing CD methods
        System.out.println("Testing CD:");
        cd.spinDisc();
        cd.storeData(new byte[10]); // Just an example, adjust the byte array size as needed
        System.out.println(cd.readData());
        cd.reportError();
        System.out.println(cd.getDiscInfo());

        // Testing DVD methods
        System.out.println("\nTesting DVD:");
        dvd.spinDisc();
        dvd.storeData(new byte[20]); // Just an example, adjust the byte array size as needed
        System.out.println(dvd.readData());
        dvd.reportError();
        System.out.println(dvd.getDiscInfo());
    }
}

// TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
