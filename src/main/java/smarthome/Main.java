package smarthome;

public class Main {
  public static void main(String[] args) {
    System.out.println("Smart Home Simulation");
    SmartLight light = new SmartLight("Living Room Light");
    SmartThermostat thermostat = new SmartThermostat("Bedroom Thermostat");

    SmartHomeController controller = new SmartHomeController();

    light.turnOn();
    light.setBrightness(75);
    light.setBrightness(false); // Overloaded method
    controller.showDeviceStatus(light);

    thermostat.turnOn();
    thermostat.setTemperature(20.5);
    controller.showDeviceStatus(thermostat);
  }
}
