package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 14:48
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class FlyRocketPowed implements FlyBehavior {
	/**
	 * 飞方法
	 */
	public void fly() {
		System.out.println("我带着火箭动力飞");
	}
}
