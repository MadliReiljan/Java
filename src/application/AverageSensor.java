package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private boolean isOn;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.isOn = false;
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
        this.isOn = true;
    }

    @Override
    public void off() {
        if (!sensors.isEmpty()) {
            sensors.get(0).off();
        }
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (!this.isOn || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors added.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        int average = sum / sensors.size();
        this.readings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
