package DesignPatterns;




public class TurnTvOff implements Command {
    ElectronicDeviceFunc device;

    public TurnTvOff(ElectronicDeviceFunc device){
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
