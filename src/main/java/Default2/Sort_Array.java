package Default2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Sort_Array {
	
//@Test
public void m1()
{
//int[]arr={23,12,62,78,34}; 
    int[] arr=new int[5]; 
	arr[0]=7;
	arr[1]=71;
	arr[2]=23;
	arr[3]=41;
	arr[4]=57;
List<Integer> li=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
{
li.add(arr[i]);
}

Collections.sort(li);
System.out.println(li);
Iterator<Integer> it=li.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}

@Test
public void m2()
{

    int[] arr=new int[5]; 
	arr[0]=7;
	arr[1]=71;
	arr[2]=23;
	arr[3]=41;
	arr[4]=57;
int temp;
for(int i=0;i<arr.length;i++)
{

for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int j=0;j<arr.length;j++)
{
System.out.println(arr[j]);
}
}

}












