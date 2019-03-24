package default3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.testng.annotations.Test;

public class Comparable_Vs_Comparator {
	//@Test
	public void compareTo()
	{
		ArrayList<Laptop_Comparable> lp=new ArrayList<Laptop_Comparable>();
		lp.add(new Laptop_Comparable("Dell",16,800));
		lp.add(new Laptop_Comparable("Acer",8,600));
		lp.add(new Laptop_Comparable("Apple",12,1200));
	
		for(Laptop_Comparable l : lp)
		{
			System.out.println("Price :"+l.getPrice()+" Brand :"+l.getBrand()+" Ram :"+l.getRam());
		}
	}
	
	@Test
	public void comparator()
	{
		ArrayList<Laptop_Comparator> lp=new ArrayList<Laptop_Comparator>();
		lp.add(new Laptop_Comparator("Dell",16,800));
		lp.add(new Laptop_Comparator("Acer",8,600));
		lp.add(new Laptop_Comparator("Apple",12,1200));
		Comparator<Laptop_Comparator> com=new Laptop_Comparator();
		Collections.sort(lp, com);
		for(Laptop_Comparator l : lp)
		{
			System.out.println("Price :"+l.getPrice()+" Brand :"+l.getBrand()+" Ram :"+l.getRam());
		}
	}

}
