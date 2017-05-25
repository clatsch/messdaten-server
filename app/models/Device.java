package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cla on 25.05.2017.
 */
public class Device {

    public int id;
    public String name;
    public String description;


    public Device(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private static List<Device> devices;
    static {
        devices = new ArrayList<Device>();
        devices.add(new Device(111, "Paperclip Red",
                "Paperclips Red"));

        devices.add(new Device(222, "Paperclips Green",
                "Paperclip Green"));

        devices.add(new Device(333, "Paperclip Heavy Duty",
                "Paperclip Heavy Duty, Long Lasting"));
    }

    public static List<Device> findAll() {
        return new ArrayList<Device>(devices);
    }
}

