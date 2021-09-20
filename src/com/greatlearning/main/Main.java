package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.CheckTarget;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		try{
			int n  ;
			int[] arr;
			int target;
			int no;

			System.out.println("Enter the size of transaction array");
			n=sc.nextInt();
			arr= new int[n];
			System.out.println("Enter the values of array");
			for(int i =0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achieved");
			no=sc.nextInt();
			System.out.println("Enter the value of target");
			target=sc.nextInt();

			CheckTarget.checkTarget(arr, no, target);
		}

		finally{
			sc.close();
		}

	}
}
