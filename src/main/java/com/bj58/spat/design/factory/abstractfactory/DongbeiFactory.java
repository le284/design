package com.bj58.spat.design.factory.abstractfactory;

public class DongbeiFactory implements ICreateFactory{

	public ICarProduct createCar() {
		System.out.println("东北制造厂，生产Car");
		return new DongbeiCarProduct();
	}

	public IBusProduct createBus() {
		System.out.println("东北制造厂，生产Bus");
		return new DongbeiBusProduct();
	}

}
