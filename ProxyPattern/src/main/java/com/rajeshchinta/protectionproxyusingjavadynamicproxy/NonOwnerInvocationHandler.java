package com.rajeshchinta.protectionproxyusingjavadynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	
	PersonBean person = null;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equalsIgnoreCase("setName") ||
				method.getName().equalsIgnoreCase("setGender") ||
				method.getName().equalsIgnoreCase("setInterests") ){
			throw new IllegalAccessException();
		}else {
			return method.invoke(person, args);
		}
	}

}
