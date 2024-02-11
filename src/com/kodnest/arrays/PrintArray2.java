package com.kodnest.arrays;
import java.util.Scanner;
public class PrintArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		//creating an array
		int[] arr=new int[size];
		System.out.println("enter"+arr.length+"numbers to be stored");
		//storing the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//display array elements
		System.out.println("The numbers stored in the array:");
		for(int x:arr)
		{
			System.out.println(x);
			
		}
		
		
		

	}

}
