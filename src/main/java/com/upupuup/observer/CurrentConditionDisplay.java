package com.upupuup.observer;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 16:19
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	/**
	 * 温度
	 */
	private float temperature;

	/**
	 * 湿度
	 */
	private float humidity;

	/**
	 * 压力
	 */
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	/**
	 * 当布告板需要更新信息的时候，调用此方法
	 */
	@Override
	public void display() {

	}

	/**
	 * 更新温度、适度和压力的方法
	 *
	 * @param temp     温度
	 * @param humidity 湿度
	 * @param pressure 压力
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {

	}
}
