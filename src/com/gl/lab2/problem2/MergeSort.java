package com.gl.lab2.problem2;

public class MergeSort {

	private void merge(int[] arr, int left, int mid, int right) {
		int len1=mid-left+1;
		int len2=right-mid;

		int leftArr[]=new int[len1];
		int rightArr[]=new int[len2];
		for(int i=0; i<len1; i++) {
			leftArr[i]=arr[left+i];
		}

		for(int j=0; j<len2; j++) {
			rightArr[j]=arr[mid+1+j];

		}

		int i=0, j=0, k=left;
		while(i<len1 && j<len2) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}

		while(i<len1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}

		while(j<len2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}

	}




	void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);

			merge(arr, left, mid, right);
		}
	}

	void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}






}
