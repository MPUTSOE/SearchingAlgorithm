package com.SearchingAlgorithm;

public class Recursive {

	public static void main(String[] args) 
	{
		System.out.println(ReduceByOne(5));

	}
	 public static int ReduceByOne(int num)
	 { 
		 if(num==1) 
		 {
			  return num;
		 }
		 
		 return ReduceByOne(num-1);
		 
	 }

}
