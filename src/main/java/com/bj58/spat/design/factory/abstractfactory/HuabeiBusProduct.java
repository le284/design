package com.bj58.spat.design.factory.abstractfactory;

public class HuabeiBusProduct implements IBusProduct{
	
	

	public HuabeiBusProduct() {
		super();
		System.out.println("HuabeiBusProduct...");
	}

	public void yunshu() {
		System.out.println("HuabeiBusProduct 可以用来运输东西");
	}

	public void bus() {
		System.out.println("HuabeiBusProduct 公共交通");
	}

}
