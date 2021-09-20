package com.greatlearning.service;

public class CheckTarget {

	public CheckTarget() {
		// TODO Auto-generated constructor stub
	}
	public static void checkTarget(int[] arr, int no, int target){

		int temp=0;
		for(int i=0;i<=no;i++) {
			temp=temp+arr[i];
			if(target<=temp) {
				++i;
				System.out.println("Target achieved after " +i+" transactions");
				return;
			}

		}
		System.out.println("Target is not achieved");
	}
}
