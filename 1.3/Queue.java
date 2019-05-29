package alg4_1_3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (this.isEmpty())  first = last;
		else oldlast.next = last;
		N++;
	}
	public Item dequeue() {
		Item item;
		item = first.item;
		first = first.next;
		if(this.isEmpty()) last=null;
		N--;
		return item;
	}
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) q.enqueue(item);
			else if (!q.isEmpty()) StdOut.println(q.dequeue());
		}
		StdOut.println("(" + q.size() +" left on the stack)");
	}
}

