package com.bj58.spat.design.factory.simplefactory;

public class CarProduct implements ISimpleProduct{

	public CarProduct() {
		System.out.println("制造了一个car");
	}
	
	public String toString() {
		return "CarProduct";
	}
}
