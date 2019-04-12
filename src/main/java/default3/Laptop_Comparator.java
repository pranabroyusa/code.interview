package default3;

import java.util.Comparator;

public class Laptop_Comparator implements Comparator<Laptop_Comparator> {
	private String brand;
	private Integer ram;
	private int price;
	public Laptop_Comparator(String brand, int ram, int price) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	
	public Laptop_Comparator() {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compare(Laptop_Comparator lap1, Laptop_Comparator lap2) {
		if(lap1.getPrice()<lap2.getPrice())
		return 1;
		else
		return -1;
	}
	
	
	
	

}
