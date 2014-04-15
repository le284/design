package com.bj58.spat.design.factory.factorymothod;

public class FactoryMothodMain {
	public static void main(String[] args) {
		IProduct cp = getProduct(new CarFactory());
		System.out.println(cp.toString());
		
		IProduct bp = getProduct(new BusFactory());
		System.out.println(bp.toString());
	}
	
	public static IProduct getProduct(IManufactureFactory factory) {
		return factory.create();
	}
}
