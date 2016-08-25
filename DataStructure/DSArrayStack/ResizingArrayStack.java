package com.ppss.DSArrayStack;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
	// 数组
	private T[] array = (T[]) new Object[1];
	// 栈尺寸
	private int stackSize = 0;
	// 扩充数组
	private void resize(int newLength){
		T[] newArray = (T[]) new Object[newLength];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}
	// 获取栈长
	public int size(){
		return stackSize;
	}
	// 检查栈是否为空
	public boolean isEmpty(){
		return stackSize == 0;
	}
	//	压栈
	public void push(T item){
		if(stackSize == array.length){
			resize(array.length * 2);
		}
		array[stackSize++] = item;
	}
	// 弹栈
	public T pop(){
		if(stackSize == 0)
			return null;
		T popItem =  array[--stackSize];
		//避免游离 + 收缩数组
		array[stackSize] = null;
		if( (stackSize > 0) && (stackSize == array.length / 4))
			resize(array.length / 2);
		return popItem;
	}
	
	//单元测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<T> iterator() {
		//返回一个迭代器
		return new StackIterator();
	}
	
	//内部类：栈迭代器
	//栈迭代器是逆序：LIFO
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

		//使用弹栈删除
		@Override
		public void remove() {}
		
	}
}
