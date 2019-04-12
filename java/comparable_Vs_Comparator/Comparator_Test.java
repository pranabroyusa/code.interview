package comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;

import default3.Laptop_Comparator;

public class Comparator_Test {
	
	
	
	@Test
	public void comparator()
	{
		Class_Laptop ap=new Class_Laptop("Apple",1250,8);
		Class_Laptop hp=new Class_Laptop("HP",975,12);
		Class_Laptop ac=new Class_Laptop("Acer",750,16);
		List<Class_Laptop> lp=new ArrayList<Class_Laptop>();
		lp.add(ac);
		lp.add(hp);
		lp.add(ap);
	
		Comparator<Class_Laptop> com=new Class_Laptop();
		Collections.sort(lp, com);
		for(Class_Laptop l:lp)
		{
			System.out.println(l.getPrice());
		}
		
		
	}

}
