package database;

import java.util.ArrayList;
import java.util.Collections;

import utils.Ser;

public class Manufacturers {

	public static void main(String[] args) {
		ArrayList<String> manufacturers = new ArrayList<String>();
		
		Collections.addAll(manufacturers, "Citronelle", "Roulenot", "Totoya" , "BMVV", "Mercedes Bendz", "Volkswagen",
				"Oneessan", "Honda", "Audi", "Chevrolet", "Hyundai", "Lexus", "Subaru", "Land Rover", "Ferrari", "Kia",
				"Suzuki", "Mazda", "Volvo", "Opel", "Mini", "Peugeot", "Bentley", "Fiat", "Cadillac", "Jeep", "Dodge",
				"Jaguar", "Rolls-Royce", "Lamborghini", "Maserati", "Aston Martin", "Chrysler", "McLaren", "Lada");

		Ser.save("manufacturers", manufacturers);
	}

}
