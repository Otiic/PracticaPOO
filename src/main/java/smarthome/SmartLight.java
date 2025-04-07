package smarthome;

public class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String name) {
        super(name);
        this.brightness = 50;
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println(getName() + " brightness set to " + brightness + "%.");
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }

    public void setBrightness(boolean increase) {
        if (increase) {
            brightness = Math.min(100, brightness + 10);
        } else {
            brightness = Math.max(0, brightness - 10);
        }
        System.out.println(getName() + " brightness adjusted to " + brightness + "%.");
    }

    @Override
    public void status() {
        System.out.println(getName() + " is " + (isOn() ? "ON" : "OFF") + " at " + brightness + "% brightness.");
    }
}