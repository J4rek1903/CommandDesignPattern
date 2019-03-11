package DesignPatterns;


public class TvPilot {
    public static ElectronicDeviceFunc getDevice(){
        return new Television();
    }
}
