package hot.devices;

import java.util.ArrayList;

import hot.BasicDevice;

public class Switch extends BasicDevice {

	ArrayList<BasicDevice> devices = new ArrayList<BasicDevice>();
	
	public void connectTo(BasicDevice device) {
		devices.add(device);
	}
	
	public void turnOn() {
		for (BasicDevice device: devices) {
			device.turnOn();
		}
	}
}
