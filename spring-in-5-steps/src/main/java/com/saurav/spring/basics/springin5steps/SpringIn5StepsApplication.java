package com.saurav.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binSearch  = new BinarySearchImpl();
		
		System.out.println(binSearch.binarySearch(new int[] {1,3,4,5,6,7,9}, 3));
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
