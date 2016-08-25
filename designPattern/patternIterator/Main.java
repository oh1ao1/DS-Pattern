package com.ppss.patternIterator;

public class Main {
	public static void main(String[] args) {
		Aggregate a = new ConcreteAggregate();
		//Integer无法类型转换为String
		a.add("小明");
		a.add("小刚");
		a.add("小红");
		IteratorZ aIterator = a.iterator();
		while(aIterator.hasNext()){
			String str = (String) aIterator.next();
			System.out.println(str);
		}
	}
}
