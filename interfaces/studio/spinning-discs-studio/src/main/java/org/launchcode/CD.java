package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public void spinDisc() {
        System.out.println("CD is spinning.");
    }

    public void storeData(byte[] data) {
        System.out.println("Storing data to the CD.");
    }

    public String readData() {
        return "Data from CD.";
    }

    public void reportError() {
        System.out.println("Reporting error from the CD.");
    }

    public String getDiscInfo() {
        return "CD Info: [details here]";
    }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public void BaseDiscCompanyInfo() {

    }
}


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


