package com.udemy;

public class Room {

    private String roomName;
    private String color;
    private int walls;
    private int doors;
    private int windows;
    private int electricalOutlets;
    private boolean ceilingLight;
    private boolean ceilingFan;
    private boolean heat;
    private boolean aircond;
    private String furnishings;

    public Room(String roomName, int doors, int windows, int electricalOutlets, boolean ceilingLight, boolean ceilingFan, String color, int walls, boolean heat, boolean aircond,  String furnishings) {
        this.roomName = roomName;
        this.doors = doors;
        this.windows = windows;
        this.electricalOutlets = electricalOutlets;
        this.ceilingLight = ceilingLight;
        this.ceilingFan = ceilingFan;
        this.color = color;
        this.walls = walls;
        this.heat = heat;
        this.aircond = aircond;
        this.furnishings = furnishings;
    }
}
