package com.upupuup.observer;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 15:10
 * @Version: 1.0
 * @Description: 观察者
 */
public interface Observer {
	/**
	 * 更新温度、适度和压力的方法
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 压力
	 */
	public void update(float temp, float humidity, float pressure);
}
