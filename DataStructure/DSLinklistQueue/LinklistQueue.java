package com.ppss.DSLinklistQueue;

import java.util.Iterator;

public class LinklistQueue<T> implements Iterable<T>{
	//�ڲ��ࣺ������
	private class Node<T>{
		T data = null;
		Node<T> next = null;
	}
	//��ͷ������ͷ
	private Node<T> first = null;
	//��β������β
	private Node<T> last = null;
	//���г���
	private int length = 0;
	
	//��
	public int length(){
		return length;
	}
	//��
	public boolean isEmpty(){
		return length == 0;
	}
	//���:�Ӷ�β��
	public boolean enqueue(T data){
		Node<T> enNode = new Node();
		enNode.data = data;
		//�ж�����ǿն���
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
	//���ӣ��Ӷ�ͷ��
	public T dequeue(){
		if(this.isEmpty())
			return null;
		//��Ϊֻ��Ҫ��ȡDATA����˲��ض���Node���ͳнӣ�ֱ��ʹ��T���ӽ�ʡ�ڴ�
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
	
	//�ڲ��ࣺ������
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
