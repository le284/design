package com.bj58.spat.design.factory.simplefactory;

public class SimpleFactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ISimpleProduct product = CreateFactory.instance.create("carproduct");

		System.out.println(product.toString());

		ISimpleProduct product1 = CreateFactory.instance.create("busproduct");

		System.out.println(product1.toString());
	}

}
