package com.bj58.spat.design.factory.abstractfactory;

public class HuabeiFactory implements ICreateFactory{

	public ICarProduct createCar() {
		System.out.println("华北制造厂，生产Car");
		return new HuabeiCarProduct();
	}

	public IBusProduct createBus() {
		System.out.println("华北制造厂，生产CBus");
		return new HuabeiBusProduct();
	}
	
}
