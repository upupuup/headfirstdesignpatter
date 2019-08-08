package com.upupuup.observer;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 15:09
 * @Version: 1.0
 * @Description: 主题类，给观察者发送消息
 */
public interface Subject {
	/**
	 * 注册观察者
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * 删除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * 通知观察者的方法
	 */
	public void notifyObservers();
}
