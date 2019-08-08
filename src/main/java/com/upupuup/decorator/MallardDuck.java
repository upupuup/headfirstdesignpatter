package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 12:40
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class MallardDuck extends Duck {
	/**
	 * 构造方法
	 */
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
