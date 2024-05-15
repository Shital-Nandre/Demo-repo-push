package com;

import java.util.stream.IntStream;

public class PrimeNumber {
	
	
	public static boolean isPrime(int number) { 
		if(number<=1) { 
			return false;
		}
		return IntStream.rangeClosed(2, number/2).noneMatch(i->number%i==0);
	}
	public static void main(String[] args) {
		IntStream.rangeClosed(2, 100).filter(PrimeNumber::isPrime).forEach(System.out::println);
	}

}
