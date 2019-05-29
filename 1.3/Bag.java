package alg4_1_3;

import java.util.Iterator;

public class Bag <Item> implements Iterable<Item>{
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public void add(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.next = oldfirst;
		first.item = item;
	}
	public Iterator<Item> iterator(){
		return new ListIterator<>();
	}
	private class ListIterator<Item> implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext() {
			return current != null;
		}
		public Item next() {
			Item item = (Item) current.item;
			current = current.next;
			return item;
		}
		public void remove() {
	}
	}
}
