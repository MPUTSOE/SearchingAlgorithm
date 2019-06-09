package com.SearchingAlgorithm;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] numbers = {13,11,12,1,3,7,2,8,5,9,4,6,10};
		
		
		
		// Using sort method to sort out the values in ascending order
		for(int first = numbers.length-1;first>0; --first) 
		{
			for( int i =0; i < first;++i) 
			{
				if(numbers[i]>numbers[i+1]) 
				{
					sort(numbers,i,i+1);
				}
			}
			
		}
		
		for(int x: numbers) 
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		
		/* Using binary search algorithm to find for a value*/
		int searchValue=10;
		int start= 0;
		int midpoint=0; // this will be my index
		int end = numbers.length-1;
		boolean isfound= false;
		
		
		while(start<=end && isfound !=true) 
		{
			midpoint= (start+end)/ 2;
			
			if(searchValue== numbers[midpoint]) 
			{
				isfound=true;
				
			}
			
			else
				if(searchValue>numbers[midpoint]) 
				{
					start= midpoint+1;
				}
				else 
				{
					end = midpoint-1;
				}
		}
		if(isfound) 
		{
			System.out.println("The value is found at index "+midpoint);
		}
		else 
		{
			System.out.println("Sorry The value is not found ");
		}
				
				

	}
	
	public static void sort(int[] numbers,int a, int b) 
	{
		int temp;
		
		 temp = numbers[a];
		 numbers[a] = numbers[b];
		 numbers[b] = temp;
		
	}


}
