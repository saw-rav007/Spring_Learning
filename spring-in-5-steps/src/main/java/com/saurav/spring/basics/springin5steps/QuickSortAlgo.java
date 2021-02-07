package com.saurav.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class QuickSortAlgo implements SortAlgorithm{
	
	public int[] sort(int[] num)
	{
		// We are not implementing the quicksort algo here
		return num;
	}

}
