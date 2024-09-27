package org.launchcode;

public abstract class BaseDisc {
    protected String discType;
    protected int capacity;  // in MB

    //public String getDiscInfo() {
       // return "Type: " + discType + ", Capacity: " + capacity + "MB";
   // }

   // public void reportError(String error) {
      //  System.out.println("Error: " + error);
   // }

    // Abstract methods that need specific implementation in subclasses
   // public abstract void spinDisc();
    //public abstract void storeData(byte[] data);
   // public abstract String readData();
    public abstract boolean isWorking();
    public abstract void BaseDiscCompanyInfo();
}
