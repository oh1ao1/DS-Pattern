package com.ppss.patternIterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements IteratorZ {
	//宿主dataStructure
	private List list = new ArrayList();
	//迭代器游标
	private int cursor = 0;
	
	//迭代器构造方法
	public ConcreteIterator(List list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		if(cursor == list.size())
			return false;
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object obj = null;
		if(this.hasNext()){
			obj = this.list.get(cursor++);
		}
		return obj;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

}
