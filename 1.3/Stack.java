package alg4_1_3;

import java.util.Iterator;

//链表实现下压栈
public class Stack<Item> /*implements Iterable<Item>*/ {
	private Node first;
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
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
//	public Iterator<Item> iterator(){
//		return new ReverseIterator();
//	}
//	private class ReverseIterator implements Iterator<Item>{
//		private int i = N;
//		public boolean hasNext() {
//			return i>0;
//		}
//		public Item next() {
//			Node x=first;
//			for (int j=0 ;j<i; j++) {
//				x = x.next;
//			}
//			return x.item;
//		}
//		public void remove(){
//	}
//	}
}
