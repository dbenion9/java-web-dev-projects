package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public void spinDisc() {
        System.out.println("DVD is spinning at a different speed.");
    }

    public void storeData(byte[] data) {
        System.out.println("Storing data to the DVD.");
    }

    public String readData() {
        return "Data from DVD.";
    }

    public void reportError() {
        System.out.println("Reporting error from the DVD.");
    }

    public String getDiscInfo() {
        return "DVD Info: [details here]";
    }

    @Override
    public boolean isWorking() {
        return true;
    }

    @Override
    public void BaseDiscCompanyInfo() {

    }
}

// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

