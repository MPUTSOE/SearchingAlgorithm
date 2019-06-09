package com.SearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] numbers = {1,2,3,4,6};
		
		System.out.println("Enter value to search");
		int searchValue = scanner.nextInt();
		
	    int index=0;
	  
		 
		for(int x = 0; x<numbers.length;++x) 
		{
			
			if( numbers[x]==searchValue) 
			{
				index=x;
				break; // it is ver important to break otherwise this will impact my out
			}
			else 
			{
				index=-1;		
			}
		}
		System.out.println("found @ "+index);

	}

}
