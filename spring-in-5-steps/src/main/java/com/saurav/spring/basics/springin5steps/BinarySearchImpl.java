package com.saurav.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortalgorithm;

//	public BinarySearchImpl(SortAlgorithm sortalgorithm) {			//CONSTRUCTOR INJECTION
//		super();
//		this.sortalgorithm = sortalgorithm;
//	}
	
	public void setSortalgorithm(SortAlgorithm sortalgorithm) {		//SETTER INJECTION (It works fine without it also)
		this.sortalgorithm = sortalgorithm;
	}


	public int binarySearch(int[] num, int numToSearchFor) {

		// BubbleSortAlgo bubbleSort = new BubbleSortAlgo(); // this is hard-coded
		// (tightly coupled)
		int[] sortednums = sortalgorithm.sort(num); // this is loosely coupled implemenatation using Interface

		System.out.println(sortalgorithm);
		// search the array

		return 3;
	}

	
}
