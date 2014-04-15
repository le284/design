package com.bj58.spat.design.factory.simplefactory;

public class CreateFactory {
	
	public static CreateFactory instance = new CreateFactory();
	
	public ISimpleProduct create(String productName) {
		if("carproduct".equalsIgnoreCase(productName)) {
			return new CarProduct();
		}else if("busproduct".equalsIgnoreCase(productName)) {
			return new BusProduct();
		}
		return null;
	}
}
