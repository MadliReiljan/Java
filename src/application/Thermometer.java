package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn;
    private Random random;

    public Thermometer() {
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (!this.isOn) {
            throw new IllegalStateException("Thermometer is off!");
        }

        return this.random.nextInt(61) - 30;
    }
}
