package com.ppss.DSLinklistQueue;

import java.util.Iterator;

public class LinklistQueue<T> implements Iterable<T>{
	//内部类：链表结点
	private class Node<T>{
		T data = null;
		Node<T> next = null;
	}
	//队头：链表头
	private Node<T> first = null;
	//队尾：链表尾
	private Node<T> last = null;
	//队列长度
	private int length = 0;
	
	//长
	public int length(){
		return length;
	}
	//空
	public boolean isEmpty(){
		return length == 0;
	}
	//入队:从队尾入
	public boolean enqueue(T data){
		Node<T> enNode = new Node();
		enNode.data = data;
		//判断如果是空队列
		if(this.isEmpty()){
			last = enNode;
			first = last;
		}
		else{
			last.next = enNode;
			last = enNode;
		}
		length++;
		return true;
	}
	//出队：从队头出
	public T dequeue(){
		if(this.isEmpty())
			return null;
		//因为只需要获取DATA，因此不必定义Node类型承接，直接使用T更加节省内存
		//Node<T> deNode = new Node();
		//deNode = first;
		//first = deNode.next;
		T deNodeData;
		deNodeData = first.data;
		first = first.next;
		length--;
		return deNodeData;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new LLStackIterator();
	}
	
	//内部类：迭代器
	private class LLStackIterator implements Iterator<T>{
		private Node<T> cursor = first;
		@Override
		public boolean hasNext() {
			return cursor != null;
		}

		@Override
		public T next() {
			T data = cursor.data;
			cursor = cursor.next;
			return data;
		}

		@Override
		public void remove() {}
	}
}
