package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 12:48
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class MuteQuack implements QuackBehavior {
	/**
	 * 呱呱叫方法
	 */
	public void quack() {
		System.out.println("我不会呱呱叫");
	}
}
