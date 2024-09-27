package org.launchcode;

public interface OpticalDisc {
    String type="OpticalDisc";
    void spinDisc();
    void storeData(byte[] data);
    String readData();
    void reportError();
    String getDiscInfo();
}