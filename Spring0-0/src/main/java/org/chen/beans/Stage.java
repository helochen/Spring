package org.chen.beans;

public class Stage {

	private Stage() {

	}

	public static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
