package park;

public class Park {
	
	private Vehicle[] park;
	private String name;
	private String address;
	
	public Park() {
		
	}
	
	public Park(Integer spots, String name, String address) {
		this.park = new Vehicle[spots];
		this.name = name;
		this.address = address;
	}
	
	public void parkAdd (Integer spot, Vehicle v) {
		park[spot] = v;
	}
	
	public void parkAdd (Integer spot, Object v) {
		park[spot] = (Vehicle) v;
	}

	public Vehicle[] getPark() {
		return park;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	
	
	

}
