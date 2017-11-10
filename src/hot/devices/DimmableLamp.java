package hot.devices;

import hot.BasicDevice;

public class DimmableLamp extends BasicDevice {
	private int intensity = 0;

	public void dimmTo(int i) {
		intensity = i;
	}

	public int getIntensity() {
		return intensity;
	}	
}
