package comparable_Vs_Comparator;

import java.util.Comparator;

public class Class_Laptop implements Comparator<Class_Laptop>{
	
	private String brand;
	private int ram;
	private double price;
	Class_Laptop(String brand,int ram,double price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	Class_Laptop()
	{
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int compare(Class_Laptop lp1, Class_Laptop lp2) {
		if(lp1.getPrice()>lp2.getPrice())
		
		return 1;
		
		else
		
		return -1;
		
	}
	

}
