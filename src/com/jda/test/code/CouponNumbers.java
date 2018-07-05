package com.jda.test.code;
import java.util.Arrays;

import com.jda.test.logic.*;
public class CouponNumbers {

	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.takeInputInteger();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = ut.takeInputInteger();
		}
		boolean[] isCollected = new boolean[n];
		Arrays.fill(isCollected, false);
		
		

	}

}
