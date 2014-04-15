package com.bj58.spat.design.factory.abstractfactory;

public class DongbeiCarProduct implements ICarProduct{

	public DongbeiCarProduct() {
		System.out.println("DongbeiCarProduct...");
	}

	public void yunshu() {
		System.out.println("DongbeiCarProduct 可以用来运输东西");
	}

	public void car() {
		System.out.println("DongbeiCarProduct 私人小轿车");
	}

}
