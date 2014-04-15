package com.bj58.spat.design.builder;

/**
 * 导演
 * */
public class Director {
	public ICar build(IBuilder builder) {
		builder.buildBody();
		builder.buildEngine();
		builder.buildWheel();
		return builder.resultProduct();
	}
}
