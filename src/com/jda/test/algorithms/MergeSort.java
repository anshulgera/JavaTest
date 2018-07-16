package com.jda.test.algorithms;
import com.jda.test.logic.Utility;

public class MergeSort {

	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter size of array.");
		int size = utility.inputPositiveIntegerAux();
		String[] array = new String[size];
		System.out.println("Enter the strings.");
		for(int i=0;i<size;i++) {
			array[i] = utility.inputString();
		}
		mergeSort(array, 0, array.length-1);
		printArray(array, array.length);
		

	}

	public static void printArray(String[] array, int length) {
		for(int i=0;i<length;i++) {
			System.out.print(array[i] + " ");
		}
		return;
		
	}

	private static void mergeSort(String[] array, int i, int j) {
		if(i<j) {
			int mid = i + (j-i)/2;
			mergeSort(array,i,mid);
			mergeSort(array,mid+1,j);
			merge(array,i,mid,j);
		}
		return;
		
	}

	private static void merge(String[] array, int l, int mid, int r) {
		
		int size1 = mid - l + 1;
		int size2 = r - mid;
		
		String[] left = new String[size1];
		String[] right = new String[size2];
		
		for(int i = 0;i<size1;i++) {
			left[i] = array[l + i];
		}
		for(int i = 0;i<size2;i++) {
			right[i] = array[mid+i+1];
		}
		
		int i=0;
		int j=0;
		int k = l;
		
		while(i<size1 && j<size2){
			if(left[i].compareTo(right[j])<=0) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<size1) {
			array[k] = left[i];
			k++;
			i++;
		}
		while(j<size2) {
			array[k] = right[j];
			k++;
			j++;
		}
		return;
	}
}
