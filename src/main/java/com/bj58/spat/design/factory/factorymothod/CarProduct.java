package com.bj58.spat.design.factory.factorymothod;

public class CarProduct implements IProduct{

	public CarProduct() {
		System.out.println("制造了一个car");
	}
	
	public String toString() {
		return "CarProduct";
	}
}
