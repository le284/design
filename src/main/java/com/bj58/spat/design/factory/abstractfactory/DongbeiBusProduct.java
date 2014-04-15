package com.bj58.spat.design.factory.abstractfactory;

public class DongbeiBusProduct implements IBusProduct{

	public DongbeiBusProduct() {
		super();
		System.out.println("DongbeiBusProduct...");
	}

	public void yunshu() {
		System.out.println("DongbeiBusProduct 可以用来运输东西");
	}

	public void bus() {
		System.out.println("DongbeiBusProduct 公共交通");
	}

}
