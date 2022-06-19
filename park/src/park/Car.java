package park;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import utils.Ser;

public class Car extends Vehicle implements Serializable {
	
	private String owner;

	public Car() {
		super();
	}
	
	public Car(String owner, String plate, String manufacturer, String model, String color) {
		super(plate, manufacturer, model, color);
		this.owner = owner;
	}
	

	public Car(int a) {
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
		return "Car [owner=" + owner + ", plate=" + plate + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", color=" + color + "]";
	}

	

}
