package com.bj58.spat.design.factory.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		ICreateFactory factory = new HuabeiFactory();
		ICarProduct cp = factory.createCar();
		cp.car();
		cp.yunshu();
		IBusProduct bp = factory.createBus();
		bp.bus();
		bp.yunshu();
		
		ICreateFactory factory1 = new DongbeiFactory();
		ICarProduct cp1 = factory1.createCar();
		cp1.car();
		cp1.yunshu();
		IBusProduct bp1 = factory1.createBus();
		bp1.bus();
		bp1.yunshu();
	}
}
