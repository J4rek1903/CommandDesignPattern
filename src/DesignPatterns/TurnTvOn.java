package DesignPatterns;


public class TurnTvOn implements Command {
    ElectronicDeviceFunc device;

    public  TurnTvOn(ElectronicDeviceFunc device){
        this.device = device;
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
