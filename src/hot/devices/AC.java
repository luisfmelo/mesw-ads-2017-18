package hot.devices;

import hot.BasicDevice;

public class AC extends BasicDevice {

	private int targetTemperature = 10;
	private int ambientTemperature = 10;

	public void setTemperature(int t) {
		targetTemperature = t;
	}

	public int getTemperature() {
		return ambientTemperature;
	}

	public int getTargetTemperature() {
		return targetTemperature;
	}

}
