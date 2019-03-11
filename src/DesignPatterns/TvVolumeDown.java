package DesignPatterns;


public class TvVolumeDown implements Command {

    ElectronicDeviceFunc device;
    public TvVolumeDown(ElectronicDeviceFunc device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
