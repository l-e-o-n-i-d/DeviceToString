package home_work_8.ex5;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString(){
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }
}
