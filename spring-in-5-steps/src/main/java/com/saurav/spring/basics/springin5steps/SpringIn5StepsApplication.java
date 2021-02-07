package com.saurav.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?					 (@component)
	// What are the dependencies of a bean?  (@autowired) 
	// Where to search for the beans?		=> NO NEEED (as we are in the same package otherwise @autoscan is used)

	public static void main(String[] args) {

		//BinarySearchImpl binSearch = new BinarySearchImpl(new QuickSortAlgo());

		//System.out.println(binSearch.binarySearch(new int[] { 1, 3, 4, 5, 6, 7, 9 }, 3));
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 1, 3, 4, 5, 6, 7, 9 }, 3);
		System.out.println(result);

		
	}

}
