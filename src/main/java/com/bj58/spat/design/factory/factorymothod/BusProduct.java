package com.bj58.spat.design.factory.factorymothod;

public class BusProduct implements IProduct{
	public BusProduct() {
		System.out.println("制造了一个bus");
	}
	public String toString() {
		return "BusProduct";
	}
}
