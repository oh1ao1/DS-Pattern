package com.ppss.DSLinklistQueue;

import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����������еĳ��ճ���
		LinklistQueue<Float> queue = new LinklistQueue<Float>();
		//�ӳ�
		System.out.println(queue.length());
		//���
		queue.enqueue(12.5f);
		queue.enqueue(0.5f);
		queue.enqueue(-2.5f);
		//�����������
		Iterator<Float> i = queue.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//����
		System.out.println("��1�����ӣ�" + queue.dequeue());
		System.out.println("��2�����ӣ�" + queue.dequeue());
		System.out.println("��3�����ӣ�" + queue.dequeue());
		System.out.println("��4�����ӣ�" + queue.dequeue());
	}

}
