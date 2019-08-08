package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 12:40
 * @Version: 1.0
 * @Description: 鸭子类
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/**
	 * 构造方法
	 */
	public Duck() {
	}

	public abstract void display();

	/**
	 * 委托给行为类
	 */
	public void performFly() {
		flyBehavior.fly();
	}

	/**
	 * 委托给行为类
	 */
	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("所有的鸭子都会漂浮！");
	}
}
