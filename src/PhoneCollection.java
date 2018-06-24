import java.util.ArrayList;

public class PhoneCollection
{
	ArrayList<Phone> phones;

	public PhoneCollection() {
		phones = new ArrayList<Phone>();
	}

	public void addPhone(Phone phone) {
		phones.add(phone);
	}

	public void removePhone(Phone phone) {
		phones.remove(phone);
	}

	public ArrayList<Phone> getAllPhones() {
		return(phones);
	}

	public Phone getPhoneByIndex(int n ) {
		return(phones.get(n));
	}

	public int getPhoneCount() {
		return(phones.size());
	}

	public ArrayList<Phone> search(String s) {
		Phone phone = null;
		ArrayList<Phone> ph = new ArrayList<Phone>();
		String str = s.toLowerCase();
		for(int i = 0; i < getPhoneCount(); i++) {
			phone = getPhoneByIndex(i);
			if(matches(phone, str)) {
				ph.add(phone);
			}
		}
		return(ph);
	}

	public boolean matches(Phone phone, String str) {
		String brandname = phone.BRANDNAME.toLowerCase();
		String modelName = phone.MODELNAME.toLowerCase();
		String operatingSystem = phone.OPERATINGSYSTEM.toLowerCase();
		String processor = phone.PROCESSOR.toLowerCase();
		String screenSize = phone.SCREENSIZE.toLowerCase();
		String ramSize = Integer.toString(phone.RAMSIZE);
		String storageSize = Integer.toString(phone.STORAGESIZE);
		String camera = phone.CAMERA.toLowerCase();
		String batterySize = phone.BATTERYSIZE.toLowerCase();
		String simSlot = phone.SIMSLOT.toLowerCase();
		if(brandname.equals(str) || modelName.contains(str)
				|| operatingSystem.contains(str) || processor.contains(str)
				|| screenSize.contains(str) || ramSize.contains(str) ||
				storageSize.contains(str) || camera.contains(str) ||
				batterySize.contains(str) || simSlot.contains(str)) {
			return(true);
		}
		return(false);
	}
}
