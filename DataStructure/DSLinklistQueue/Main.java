package com.ppss.DSLinklistQueue;

import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 测试链表队列的长空出入
		LinklistQueue<Float> queue = new LinklistQueue<Float>();
		//队长
		System.out.println(queue.length());
		//入队
		queue.enqueue(12.5f);
		queue.enqueue(0.5f);
		queue.enqueue(-2.5f);
		//迭代输出队伍
		Iterator<Float> i = queue.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//出队
		System.out.println("第1个出队：" + queue.dequeue());
		System.out.println("第2个出队：" + queue.dequeue());
		System.out.println("第3个出队：" + queue.dequeue());
		System.out.println("第4个出队：" + queue.dequeue());
	}

}
