package com.gl.lab2.problem1;

import java.util.Scanner;

public class Transaction {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int sizeOfTransaction=sc.nextInt();
		int arr[]=new int[sizeOfTransaction];
		System.out.println("enter the values of array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int noOfTargets=sc.nextInt();
		for(int i=0; i<noOfTargets; i++) {
			System.out.println("enter the value of target");
			int target=sc.nextInt();
			long sum=0;
			boolean targetAchieved=false;
			for(int j=0; j<arr.length;j++) {
				sum+=arr[j];
				if(sum>target) {
					targetAchieved=true;
					System.out.println("Target achieved after "+(j+1)+" transactions"+"\n");
					break;
				}
			}
			if(!targetAchieved) {
				System.out.println("Given target is not achieved"+"\n");
			}
		}
	}
}
