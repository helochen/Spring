package org.chen.beans;

public class Stage {

	public Stage() {

	}

	public static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
