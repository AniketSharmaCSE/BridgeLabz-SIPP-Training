package singleinheritance.smarthomedevices;

public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "Online", 22.5);

        System.out.println("Thermostat Status");
        t1.displayStatus();
    }
}
