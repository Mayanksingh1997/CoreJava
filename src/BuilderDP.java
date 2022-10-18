class Phone{
	private String os;
	private int ram;
	private String processor;
	private int battery;
	public Phone(String os, int ram, String processor, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery + "mah]";
	}
	
}

class PhoneBuilder
{
	private String os;
	private int ram;
	private String processor;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(os, ram, processor, battery);
	}
	
	
}


public class BuilderDP {

	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOs("Android").setBattery(5000).getPhone();
		System.out.println(phone);
		

	}

}
