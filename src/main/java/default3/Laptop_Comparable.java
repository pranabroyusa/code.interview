package default3;

public class Laptop_Comparable implements Comparable<Laptop_Comparable> {
	private String brand;
	private Integer ram;
	private int price;
	public Laptop_Comparable(String brand, int ram, int price) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
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
	public int compareTo(Laptop_Comparable lp2) {
		if(this.getPrice()<lp2.getPrice())
		return 1;
		else
			return -1;
	}
	
	
	
	

}
