package com.ppss.patternIterator;

public class Main {
	public static void main(String[] args) {
		Aggregate a = new ConcreteAggregate();
		//Integer�޷�����ת��ΪString
		a.add("С��");
		a.add("С��");
		a.add("С��");
		IteratorZ aIterator = a.iterator();
		while(aIterator.hasNext()){
			String str = (String) aIterator.next();
			System.out.println(str);
		}
	}
}
