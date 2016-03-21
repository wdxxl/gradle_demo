package com.wdxxl.call;

import com.wdxxl.common.publishTask.SayHello;

public class CallPublishTaskjar {

	public static void main(String[] args) {
		SayHello sayHello = new SayHello();
		sayHello.printHello("in call method");
	}
}
