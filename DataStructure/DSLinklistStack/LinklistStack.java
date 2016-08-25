package com.ppss.DSLinklistStack;

import java.util.Iterator;

//链表栈
public class LinklistStack<T> implements Iterable<T>{
	//内部结点类
	private class Node<T>{
		T data = null;
		Node<T> next = null;
	}
	//链表头
	private Node<T> first = null;
	//链表尺寸
	private int linklistLength = 0;
	
	//返回栈的大小：即链表长度
	public int size(){
		return linklistLength;
	}
	//判断栈是否为空
	public boolean isEmpty(){
		return linklistLength == 0;
	}
	//压栈
	public void push(T data){
		Node newNode = new Node();
		//链表不为空时，结点接在最前面
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		linklistLength++;
	}
	//弹栈
	public T pop(){
		//空栈时弹出null
		if(this.isEmpty())
			return null;
		Node popNode = first;
		//更新链表头
		first = popNode.next;
		linklistLength--;
		return (T) popNode.data;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new LLStackIterator();
	}
	//内部类：迭代器
	private class LLStackIterator implements Iterator<T>{
		//当前迭代的结点
		private Node<T> current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T data = current.data;
			current = current.next;
			return data;
		}

		//对于栈不允许直接删除：必须使用弹栈
		@Override
		public void remove() {}
		
	}
}
