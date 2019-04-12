package Default2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Binary_Search {
	//@Test
	public void m1()
	{
		int[] arr= {25,12,33,56,71};
		int x=Arrays.binarySearch(arr, 387);
		if(x<0)
		{
		System.out.println("Is Not present");	
		}
		else
		{
			System.out.println("Is  present");
		}
		
	}
	
	//@Test
	public void m2()
	{
		int[] arr= {25,12,33,56,71,11,23,44,41,89};
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
		System.out.println(arr[i]);
		}
		
	}
	
	
	@Test
	public void m3(){
		int[] arr1= {2,9,12,23,44,41,56,71,77,85,89};
		binary(arr1,0,11,45);	
	}
	
	public int binary(int[] arr1,int l,int r,int num)
	{
		
		if(l<r)
		{
			int mid=l+(l+r)/2;
			if(num==arr1[mid])
			{
				System.out.println(num+" present on index "+mid);
				return mid;
			}
			else if(num>arr1[mid])
			{
				System.out.println(num+" present on index "+mid);
				return binary(arr1,l,mid-1,num);
			}
			else
			{
				System.out.println(num+" present on index "+mid);
				return binary(arr1,mid+1,r,num);
			}
			
		}
		else
		{
			System.out.println("Does not exist");
			return -1;
		}
		
	
	}

}
