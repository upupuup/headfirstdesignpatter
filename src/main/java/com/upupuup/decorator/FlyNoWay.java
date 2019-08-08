package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 12:44
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class FlyNoWay implements FlyBehavior {

	/**
	 * 什么都不做，不会飞
	 */
	public void fly() {
		System.out.println("我不会飞");
	}
}
