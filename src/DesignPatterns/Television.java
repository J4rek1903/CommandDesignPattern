package DesignPatterns;


public class Television implements ElectronicDeviceFunc {
    private int volume = 0;
    private boolean isOn = false;
    @Override
    public void on() {
        isOn =true;
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        if(isOn){
            isOn=false;
            System.out.println("TV is off");
        }

    }

    @Override
    public void volumeUp() {
        if(isOn){
            volume++;
            System.out.println("Volume : "+volume );
        }else{
            System.out.println("THE TV IS OFF");
        }
    }

    @Override
    public void volumeDown() {
        if(isOn){
            if(volume==0){
                volume=0;
            }else{
                volume--;
                System.out.println("Volume : "+volume);
            }
        }else{
            System.out.println("THE TV IS OF");
        }
    }
}
