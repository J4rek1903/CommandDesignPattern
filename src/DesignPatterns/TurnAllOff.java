package DesignPatterns;

import java.util.List;


public class TurnAllOff implements Command {

    List<ElectronicDeviceFunc> listOfDevices;

    public TurnAllOff(List<ElectronicDeviceFunc> listOfDevices){
        this.listOfDevices=listOfDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDeviceFunc device : listOfDevices){
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDeviceFunc device:listOfDevices){
            device.on();
        }
    }
}
