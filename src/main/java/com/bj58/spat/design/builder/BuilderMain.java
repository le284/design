package com.bj58.spat.design.builder;

public class BuilderMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Director director = new Director();
		IBuilder builder = new CarBuilder();
		ICar car = director.build(builder);
		if(car instanceof CarImpl) {
			System.out.println("制造了一个 carImple");
		}
	}

}
