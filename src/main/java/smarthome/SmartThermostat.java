package smarthome;

public class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String name) {
        super(name);
        this.temperature = 22.0;
    }

    public void setTemperature(double temp) {
        temperature = temp;
        System.out.println(getName() + " temperature set to " + temperature + "°C.");
    }

    @Override
    public void status() {
        System.out.println(getName() + " is " + (isOn() ? "ON" : "OFF") + " at " + temperature + "°C.");
    }
}
