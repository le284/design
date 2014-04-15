package com.bj58.spat.design.factory.factorymothod;

public class BusFactory implements IManufactureFactory{

	public IProduct create() {
		System.out.println("正在制造一辆bus");
		return new BusProduct();
	}

}
