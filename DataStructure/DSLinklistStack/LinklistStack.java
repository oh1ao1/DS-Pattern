package com.ppss.DSLinklistStack;

import java.util.Iterator;

//����ջ
public class LinklistStack<T> implements Iterable<T>{
	//�ڲ������
	private class Node<T>{
		T data = null;
		Node<T> next = null;
	}
	//����ͷ
	private Node<T> first = null;
	//����ߴ�
	private int linklistLength = 0;
	
	//����ջ�Ĵ�С����������
	public int size(){
		return linklistLength;
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return linklistLength == 0;
	}
	//ѹջ
	public void push(T data){
		Node newNode = new Node();
		//����Ϊ��ʱ����������ǰ��
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		linklistLength++;
	}
	//��ջ
	public T pop(){
		//��ջʱ����null
		if(this.isEmpty())
			return null;
		Node popNode = first;
		//��������ͷ
		first = popNode.next;
		linklistLength--;
		return (T) popNode.data;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new LLStackIterator();
	}
	//�ڲ��ࣺ������
	private class LLStackIterator implements Iterator<T>{
		//��ǰ�����Ľ��
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

		//����ջ������ֱ��ɾ��������ʹ�õ�ջ
		@Override
		public void remove() {}
		
	}
}
