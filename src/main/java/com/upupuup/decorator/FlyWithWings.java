package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 12:43
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class FlyWithWings implements FlyBehavior {
	/**
	 * 实现鸭子飞
	 */
	public void fly() {
		System.out.println("我会飞");
	}
}
