package com.kodnest.arrays;
import java.util.Scanner;
public class SwappingOfelementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int size=scan.nextInt();
		//creating an array
		int[]arr=new int[size];
		//storing the elements in array
		System.out.println("Enter"+arr.length+"elements in an array");
		arr[0]=10;
		arr[1]=20;
		arr[2]=40;
		arr[3]=30;
		arr[4]=50;
		//displaying the elements in an array
		System.out.println("The elements stored in array before swapping");
		for(int x:arr)
		{
			System.out.println(x);
		}
		//enter the 2 indexes from the user
		int temp=arr[2];
		arr[2]=arr[3];
		arr[3]=temp;
		System.out.println("The elments stored in array after swapping");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
		
		

	}

}
