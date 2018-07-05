package com.jda.test.code;
import java.util.Arrays;

import com.jda.test.logic.*;
public class Triplets {

	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.takeInputInteger();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = ut.takeInteger();
		}
		Arrays.sort(arr);
		int triplets = getTriplets(arr, n);
		

	}

}
