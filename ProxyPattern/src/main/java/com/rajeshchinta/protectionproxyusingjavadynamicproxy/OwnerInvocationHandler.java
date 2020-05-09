package com.rajeshchinta.protectionproxyusingjavadynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person = null;

	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("setHot")) {
			throw new IllegalAccessException();
		} else {
			return method.invoke(person, args);
		}
	}
}
