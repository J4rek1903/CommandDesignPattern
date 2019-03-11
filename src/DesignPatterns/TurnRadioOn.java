package DesignPatterns;


public class TurnRadioOn implements Command {

    ElectronicDeviceFunc device;

    public TurnRadioOn(ElectronicDeviceFunc device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
