package com.bj58.spat.design.factory.abstractfactory;

public interface ICreateFactory {
	
	ICarProduct createCar();

	IBusProduct createBus();
}
