package com.fdmgroup.model;

import java.util.Random;

public class IdGenerator {

	private static Random random = new Random();
	
	public static int generate() {
		return Math.abs(random.nextInt(900000) + 100000);
	}

}