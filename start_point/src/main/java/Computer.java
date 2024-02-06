public class Computer {
//    class attributes
    private int storage;
    private String printerModel;

//    constructor function
    public Computer(int storage) {
        this.storage = storage;
        this.printerModel = "";
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public void addStorage(int addAmount) {
        this.storage += addAmount;
    }
}
