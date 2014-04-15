package com.bj58.spat.design.builder;
/**
 * car的制造者
 * @author 58
 *
 */
public class CarBuilder implements IBuilder{
	
	private CarImpl car = new CarImpl();

	public void buildBody() {
		car.setBody(new CarBody());
	}

	public void buildWheel() {
		car.setWheel(new Wheel());
	}

	public void buildEngine() {
		car.setEngine(new Engine());
	}

	public ICar resultProduct() {
		return car;
	}

}
