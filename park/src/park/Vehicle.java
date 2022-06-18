package park;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import utils.Ser;

public abstract class Vehicle {
	protected String plate;
	protected String manufacturer;
	protected String model;
	protected String color;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String plate, String manufacturer, String model, String color) {
		this.plate = plate;
		this.model = model;
		this.manufacturer = manufacturer ;
		this.color = color;
		
	}
	
	
	public static Vehicle vehicle() {
		switch (ThreadLocalRandom.current().nextInt(0, 2)) {
		case 0 : //Car
			return new Car(0);
		case 1 : 
			return new Motorcycle(0);
		case 2 :
			break;
		}
		return null;		
		
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String randomPlate() {
		String plate = "";
		for (int i = 0; i < 11 ; i++) {
			if (i== 3 || i== 7) {
				plate += "-";
			}
			plate += ThreadLocalRandom.current().nextInt(0, 10);
		}
		return plate;
	}
	
	public String randomManufacturer() {
		ArrayList<String> list = (ArrayList<String>) Ser.load("manufacturers.xml");
		return list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
	}
	
	public String randomModel() {
		String base = "AZERTYUIOPMLKJHGFDSQWXCVBNazertyuiopmlkjhgfdsqwxcvbn0987654321";
		String model = "";
		for (int i = 0; i < 7 ; i++) {
			model += base.charAt(ThreadLocalRandom.current().nextInt(0, base.length()));
		}
		return model;
	}
	
	public String randomColor() {
		String base = "0123456789ABCDEF";
		String color = "#";
		for (int i = 0; i < 6 ; i++) {
			color += base.charAt(ThreadLocalRandom.current().nextInt(0, base.length()));
		}
		return color;
	}
	
	
	
	
	

}
