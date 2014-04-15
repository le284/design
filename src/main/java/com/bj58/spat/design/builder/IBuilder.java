package com.bj58.spat.design.builder;

/**
 * 抽象制造者
 * 
 * */

public interface IBuilder {
	void buildBody();
	void buildWheel();
	void buildEngine();
	
	ICar resultProduct();
}
