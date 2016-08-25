package com.ppss.DSLinklistStack;

import java.util.Iterator;

public class Main {
	 public static void main(String[] args) {
		//创建一个链表栈，测试长空压弹
		 LinklistStack<Integer> lLStack = new LinklistStack<Integer>();
		 if(lLStack.isEmpty())
			 System.out.println("栈中为空");
		 lLStack.push(1);
		 lLStack.push(2);
		 lLStack.push(3);
		 System.out.println("栈的尺寸为" + lLStack.size());
		 //获取迭代器，进行迭代
		 Iterator<Integer> i = lLStack.iterator();
		 System.out.println("遍历栈中所有元素：");
		 while(i.hasNext()){
			 System.out.println(i.next());
		 }
		 //出栈
		 System.out.println("第1个出栈：" + lLStack.pop());
		 System.out.println("第2个出栈：" + lLStack.pop());
		 System.out.println("第3个出栈：" + lLStack.pop());
		 System.out.println("第4个出栈：" + lLStack.pop());
	}
}
