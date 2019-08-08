package com.upupuup.observer;

import java.util.List;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 15:19
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class WeatherData implements Subject {
	/**
	 * 存放观察者
	 */
	private List<Observer> observers;

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
	private float pressure;

	/**
	 * 注册观察者
	 * @param o
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * 删除观察者
	 * @param o
	 */
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	/**
	 * 通知观察者的方法
	 */
	@Override
	public void notifyObservers() {
		 observers.forEach(observer -> observer.update(temperature, humidity, pressure));
	}

	/**
	 * 得到新的更新值之后，通知观察者
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * 设置数据的方法
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasuresments(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
