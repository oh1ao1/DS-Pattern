package com.ppss.DSLinklistStack;

import java.util.Iterator;

public class Main {
	 public static void main(String[] args) {
		//����һ������ջ�����Գ���ѹ��
		 LinklistStack<Integer> lLStack = new LinklistStack<Integer>();
		 if(lLStack.isEmpty())
			 System.out.println("ջ��Ϊ��");
		 lLStack.push(1);
		 lLStack.push(2);
		 lLStack.push(3);
		 System.out.println("ջ�ĳߴ�Ϊ" + lLStack.size());
		 //��ȡ�����������е���
		 Iterator<Integer> i = lLStack.iterator();
		 System.out.println("����ջ������Ԫ�أ�");
		 while(i.hasNext()){
			 System.out.println(i.next());
		 }
		 //��ջ
		 System.out.println("��1����ջ��" + lLStack.pop());
		 System.out.println("��2����ջ��" + lLStack.pop());
		 System.out.println("��3����ջ��" + lLStack.pop());
		 System.out.println("��4����ջ��" + lLStack.pop());
	}
}
