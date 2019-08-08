package com.upupuup.observer;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/8/8 15:17
 * @Version: 1.0
 * @Description: 显示数据的接口
 */
public interface DisplayElement {
	/**
	 * 当布告板需要更新信息的时候，调用此方法
	 */
	public void display();
}
