package com.bj58.spat.design.factory.simplefactory;

public class BusProduct implements ISimpleProduct{
	public BusProduct() {
		System.out.println("制造了一个bus");
	}
	public String toString() {
		return "BusProduct";
	}
}
