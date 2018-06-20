public class Phone
{
	private String operatingSystem;
	private String screenSize;
	private String memorySize;
	private String cameraPixel;
	private String batterySize;

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getOperatingSystem() {
		return(operatingSystem);
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public void setMemorySize(String memorySize) {
		this.setMemorySize = memorySize;
	}

	public String getMemorySize() {
		return(memorySize);
	}

	public void setCameraPixel(String cameraPixel) {
		this.cameraPixel = cameraPixel;
	}

	public String getCameraPixel() {
		return(cameraPixel);
	}

	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}

	public String getBatterySize() {
		return(batterySize);
	}
}