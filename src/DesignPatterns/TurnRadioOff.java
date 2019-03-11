package DesignPatterns;


public class TurnRadioOff implements Command {
    ElectronicDeviceFunc device;

    public TurnRadioOff(ElectronicDeviceFunc device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
