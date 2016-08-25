package com.ppss.patternIterator;

public interface Aggregate {
	public boolean add(Object obj);
	public boolean remove(Object obj);
	public IteratorZ iterator();
}
