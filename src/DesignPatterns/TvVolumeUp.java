package DesignPatterns;


public class TvVolumeUp implements Command {

    ElectronicDeviceFunc device;

    public TvVolumeUp(ElectronicDeviceFunc device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
