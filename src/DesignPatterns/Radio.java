package DesignPatterns;


public class Radio implements ElectronicDeviceFunc {
    private int Volume = 0;
    private boolean isOn = false;
    @Override
    public void on() {
        if(!isOn){
            isOn=true;
            System.out.println("RADIO IS ON");
        }
    }

    @Override
    public void off() {
        if(isOn){
            isOn=false;
            System.out.println("RADIO IS OFF");
        }
    }

    @Override
    public void volumeUp() {
        Volume++;
        System.out.println("Radio Volume: "+Volume);
    }

    @Override
    public void volumeDown() {
        Volume--;
        System.out.println("Radio Volume: "+Volume);
    }
}
