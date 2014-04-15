package com.bj58.spat.design.factory.abstractfactory;

public class HuabeiCarProduct implements ICarProduct{
	
	public HuabeiCarProduct() {
		System.out.println("HuabeiCarProduct...");
	}

	public void yunshu() {
		System.out.println("HuabeiCarProduct 可以用来运输东西");
	}

	public void car() {
		System.out.println("HuabeiCarProduct 私人小轿车");
	}

}
