package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ElectronicDeviceFunc tv = TvPilot.getDevice();
//ON
        TurnTvOn turnTvOn = new TurnTvOn(tv);

        DeviceButton OnBTN = new DeviceButton(turnTvOn);
//OFF
        TurnTvOff turnTvOff = new TurnTvOff(tv);

        DeviceButton OffBTN = new DeviceButton(turnTvOff);
//VOLUME UP
        TvVolumeUp tvVolUp = new TvVolumeUp(tv);
        DeviceButton volUpBTN = new DeviceButton(tvVolUp);
//VOLUME DOWN
        TvVolumeDown tvVolDown = new TvVolumeDown(tv);
        DeviceButton volDownBTN = new DeviceButton(tvVolDown);
//USING BUTTONS
        volUpBTN.press();
        OnBTN.press();
        volUpBTN.press();
        volUpBTN.press();
        OffBTN.press();
        OnBTN.press();
        volDownBTN.press();
//USING TURN_ALL_OFF
        System.out.println("-----------------------");
        Television tele = new Television();
        Radio radio = new Radio();

        TurnTvOn tvOn = new TurnTvOn(tele);
        DeviceButton onTeleBtn = new DeviceButton(tvOn);
        onTeleBtn.press();

        TurnRadioOn radioOn = new TurnRadioOn(radio);
        DeviceButton onRadioBTN = new DeviceButton(radioOn);
        onRadioBTN.press();

        List<ElectronicDeviceFunc> allDevices = new ArrayList<ElectronicDeviceFunc>();
        allDevices.add(tele);
        allDevices.add(radio);

        TurnAllOff turnAllDown = new TurnAllOff(allDevices);
        DeviceButton shutAllDown = new DeviceButton(turnAllDown);
        shutAllDown.press();
    }
}
