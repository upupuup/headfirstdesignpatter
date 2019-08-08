package com.upupuup.decorator;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 13:01
 * @Version: 1.0
 * @Description: 测试鸭子的
 */
public class Test {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.display();

		// 模型鸭
		Duck modelDuck = new ModelDuck();
		modelDuck.performQuack();
		modelDuck.setFlyBehavior(new FlyRocketPowed());
		modelDuck.performFly();
		modelDuck.display();
	}
}
