package com.kodnest.arrays;
import java.util.Scanner;
public class PrintArrayContentPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Taking the size of an array from  user
		int size=scan.nextInt();
		//creating an array
		int[]arr=new int[size];
		//storing the elements in an array
		System.out.println("Enter "+arr.length+"number of elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//displaying the array elements
		System.out.println("The elements to be stored");
		for(int x:arr)
		{
			if(x>0)
			System.out.println(x);
		}
	   

	}

}
