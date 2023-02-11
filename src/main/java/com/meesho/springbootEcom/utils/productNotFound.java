package com.meesho.springbootEcom.utils;

	public class productNotFound extends Exception {

		public productNotFound (String message) {
			super(message);
			System.out.println(message);
		}
		
	}
	



