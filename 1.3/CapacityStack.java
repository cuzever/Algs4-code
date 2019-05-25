package alg4_1_3;

//实现下压栈（动态调整数组大小）
import java.util.Iterator;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CapacityStack<Item> {
	private Item[] a;
	private int N;
	public CapacityStack() {
		a = (Item[]) new Object[1];
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for(int i=0;i<N;i++) {
			temp[i] = a[i];
		}
		a =temp;
	}
	public void push(Item item) {
		if(N==a.length) resize(2*a.length);
		a[N++] = item;
	}
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if(N>0&&N<a.length/4) resize(a.length/2);
		return item;
	}
	public static void main(String[] args) {
		CapacityStack<String> a = new CapacityStack<String>();
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) a.push(item);
			else if (!a.isEmpty()) StdOut.println(a.pop());
		}
		StdOut.println("(" + a.size() +" left on the stack)");
	}
	public Iterator<Item> iterator(){
		return new ReverseArraryIterator();
	}
	private class ReverseArraryIterator implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() {
			return i>0;
		}
		public Item next() {
			return a[--i];
		}
		public void remove(){
	}
	}
}
