package home_work_8.ex5;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer=" + manufacturer +
                ", price=" + (int) price +
                ", serialNumber=" + serialNumber;
    }
}
