package com.kodnest.arrays;
import java.util.Scanner;
public class PrintArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the size of an array");
	   int size=scan.nextInt();
	   //creating the array
	   int[]arr=new int[size];
	   //storing the elements in an array
	   System.out.println("The stored"+arr.length+"elements are:");
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   arr[i]=scan.nextInt();
	   }
	   //displaying the elements in an array
	   System.out.println("The elements in an array forward direction");
	   for(int x:arr)
	   {
		   System.out.println(x);
	   }
	   //printing the reverse direction of an array
	   System.out.println("The reverse direction of an array:");
	   for(int i=arr.length-1;i>=0;i--)
	   {
		   System.out.println(arr[i]);
	   }
	   

	}

}
