package com.gl.lab2.problem2;

import java.util.HashMap;
import java.util.Scanner;


public class CurrencyDenominations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int sizeOfCurrencyDenominations=sc.nextInt();
		int arr[]=new int[sizeOfCurrencyDenominations];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<sizeOfCurrencyDenominations; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amountToPay=sc.nextInt();
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		MergeSort mg=new MergeSort();
		mg.mergeSort(arr, 0, arr.length-1);
		int remainder=amountToPay;
		int d=0;
		if(amountToPay<arr[0]) {
			System.out.println("amount can't be less than lowest currency value");
		}else {
			for(int i=arr.length-1; i>=0; i--) {
				if(arr[i]<=remainder) {
	              d=remainder/arr[i];
	              remainder=remainder%arr[i];
	              map.put(arr[i], d);
	              if(remainder==0)
	            	  break;
				}
				
			}
			
		}
		

		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=arr.length-1; i>=0; i--) {
			if(map.containsKey(arr[i])) {
				System.out.println(arr[i]+":"+map.get(arr[i]));
			}

		}
		
		if(remainder!=0) {
			System.out.println("can't pay rest amount "+remainder+" as no currency is available for "+remainder);
		}
		
		



	}

}
