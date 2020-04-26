package com.rajeshchinta.AdaptEnumeratorToIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator<Object>{
	
	private Enumeration enumeration = null;
	
	public EnumerationIteratorAdapter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return this.enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return this.enumeration.nextElement();
	}

}
