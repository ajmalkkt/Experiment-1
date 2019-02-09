package com.ajmal.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyList {
	
	private Node  head = null;//root
	private Node tail = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList list = new MyList();
		for(char i = 65;i < 92;i++) {
			
			String str = String.valueOf(i);
			System.out.println("Name:"+str);
			list.add(str);
		}
		Node node = list.getHead();
		System.out.print("\nOriginal:");
		print(node);
	    list.reverse(list.getHead());
	    node = list.getHead();
		System.out.print("\nREversed:");
		print(node);
		
	}
	
	static void print(Node node) {
		while(node!=null ) {
			System.out.print("["+node.name+"]");
			node = node.next;
		}
	}
	
	public Node getHead() {
		return head;
	}

	void reverse(Node start) {
		Node temp = start;
		Node right = temp;
		Node left = null;
		while (temp != null) {
			temp = temp.next;
			right.next = left;
			left = right;
			right = temp;
			
		}
		head = left;
	}
	public MyList() {
		this.tail = head;
	}

    public void add(String name) {
    	Node newNode = new Node(name, null);
    	if(head == null) {
    		head = newNode;
    	} else {
    		newNode.next = head;
    		head = newNode;
    	}
    }

	static class Node {
		private String name;
		private Node next;
		public Node(String name, Node next) {
			super();
			this.name = name;
			this.next = next;//by default null, so need to set
		}
		public String getName() {
			return name;
		}
		public Node getNext() {
			return next;
		}

	}

}


