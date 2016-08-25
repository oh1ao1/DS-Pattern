package com.ppss.DSArrayStack;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
	// ����
	private T[] array = (T[]) new Object[1];
	// ջ�ߴ�
	private int stackSize = 0;
	// ��������
	private void resize(int newLength){
		T[] newArray = (T[]) new Object[newLength];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}
	// ��ȡջ��
	public int size(){
		return stackSize;
	}
	// ���ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return stackSize == 0;
	}
	//	ѹջ
	public void push(T item){
		if(stackSize == array.length){
			resize(array.length * 2);
		}
		array[stackSize++] = item;
	}
	// ��ջ
	public T pop(){
		if(stackSize == 0)
			return null;
		T popItem =  array[--stackSize];
		//�������� + ��������
		array[stackSize] = null;
		if( (stackSize > 0) && (stackSize == array.length / 4))
			resize(array.length / 2);
		return popItem;
	}
	
	//��Ԫ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<T> iterator() {
		//����һ��������
		return new StackIterator();
	}
	
	//�ڲ��ࣺջ������
	//ջ������������LIFO
	private class StackIterator implements Iterator<T>{
		private int i = stackSize;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i>0;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return array[--i];
		}

		//ʹ�õ�ջɾ��
		@Override
		public void remove() {}
		
	}
}
