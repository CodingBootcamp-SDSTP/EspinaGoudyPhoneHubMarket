public class Phone 
{
	public static class PhoneBuilder
	{
		int phoneID;
		String brandName;
		String modelName;
		String operatingSystem;
		String processor;
		String screenSize;
		int ramSize;
		int storageSize;
		String camera;
		String batterySize;
		String simSlot;

		public PhoneBuilder phoneID(int i) {
			phoneID = i;
			return(this);
		}

		public int getPhoneID() {
			return(phoneID);
		}

		public PhoneBuilder brandName(String b) {
			brandName = b;
			return(this);
		}

		public String getBrandName() {
			return(brandName);
		}

		public PhoneBuilder modelName(String m) {
			modelName = m;
			return(this);
		}

		public String getModelName() {
			return(modelName);
		}

		public PhoneBuilder operatingSystem(String os) {
			operatingSystem = os;
			return(this);
		}

		public String getOperatingSystem() {
			return(operatingSystem);
		}

		public PhoneBuilder processor(String p) {
			processor = p;
			return(this);
		}

		public String getProcessor() {
			return(processor);
		}

		public PhoneBuilder screenSize(String s) {
			screenSize = s;
			return(this);
		}

		public String getScreenSize() {
			return(screenSize);
		}

		public PhoneBuilder ramSize(int r) {
			ramSize = r;
			return(this);
		}

		public int getRamSize() {
			return(ramSize);
		}

		public PhoneBuilder storageSize(int ss) {
			storageSize = ss;
			return(this);
		}

		public int getStorageSize() {
			return(storageSize);
		}

		public PhoneBuilder camera(String c) {
			camera = c;
			return(this);
		}

		public String getCamera() {
			return(camera);
		}

		public PhoneBuilder batterySize(String b) {
			batterySize = b;
			return(this);
		}

		public String getBatterySize() {
			return(batterySize);
		}

		public PhoneBuilder simSlot(String sl) {
			simSlot = sl;
			return(this);
		}

		public String getSimSlot() {
			return(simSlot);
		}

		public Phone build() {
			return(new Phone(this));
		}
	}

	final int PHONEID;
	final String BRANDNAME;
	final String MODELNAME;
	final String OPERATINGSYSTEM;
	final String PROCESSOR;
	final String SCREENSIZE;
	final int RAMSIZE;
	final int STORAGESIZE;
	final String CAMERA;
	final String BATTERYSIZE;
	final String SIMSLOT;

	public Phone(PhoneBuilder pb) {
		PHONEID = pb.getPhoneID();
		BRANDNAME = pb.getBrandName();
		MODELNAME = pb.getModelName();
		OPERATINGSYSTEM = pb.getOperatingSystem();
		PROCESSOR = pb.getProcessor();
		SCREENSIZE = pb.getScreenSize();
		RAMSIZE = pb.getRamSize();
		STORAGESIZE = pb.getStorageSize();
		CAMERA = pb.getCamera();
		BATTERYSIZE = pb.getBatterySize();
		SIMSLOT = pb.getSimSlot();
	}
}
