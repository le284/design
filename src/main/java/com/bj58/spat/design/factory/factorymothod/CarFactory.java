package com.bj58.spat.design.factory.factorymothod;

public class CarFactory implements IManufactureFactory{

	public IProduct create() {
		System.out.println("正在制造一辆car");
		return new CarProduct();
	}

}
