package com.ppss.patternIterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List list = new ArrayList();

	@Override
	public IteratorZ iterator() {
		//此处需要传入宿主dataStructure
		//***还有一种方法：将具体迭代器设置为嵌套类（内部类）
		return new ConcreteIterator(this.list);
	}

	@Override
	public boolean add(Object obj) {
		list.add(obj);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean remove(Object obj) {
		list.remove(obj);
		// TODO Auto-generated method stub
		return false;
	}

}
