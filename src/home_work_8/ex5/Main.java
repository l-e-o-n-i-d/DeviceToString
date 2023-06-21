package home_work_8.ex5;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device);
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println(monitor);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Baseus", 15, "MN090004567AXV", 1000, "MAC12345767");
        System.out.println(ethernetAdapter);
    }
}
