package com.ppss.patternIterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List list = new ArrayList();

	@Override
	public IteratorZ iterator() {
		//�˴���Ҫ��������dataStructure
		//***����һ�ַ��������������������ΪǶ���ࣨ�ڲ��ࣩ
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
