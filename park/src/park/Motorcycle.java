package park;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import utils.Ser;

public class Motorcycle extends Vehicle {
	
	private String owner;

	public Motorcycle() {
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String owner, String plate, String manufacturer, String model, String color) {
		super(plate, manufacturer, model, color);
		this.owner = owner;
	}
	
	public Motorcycle(int a) {
		owner = randomOwner();
		plate = randomPlate();
		manufacturer = randomManufacturer();
		model = randomModel();
		color = randomColor();
		
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String randomOwner() {
		ArrayList<String> list = (ArrayList<String>) Ser.load("names.xml");
		
		return list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
	}
	
	@Override
	public String toString() {
		return "Motorcycle [owner=" + owner + ", plate=" + plate + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", color=" + color + "]";
	}

}
