//package alg4_1_3;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class TestFixedCapacityStackOfStrings {
	public static void main(String[] args) {
		FixedCapacityStackOfStrings a = new FixedCapacityStackOfStrings(100);
		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) a.push(item);
			else if (!a.isEmpty()) StdOut.println(a.pop());
		}
		StdOut.println("(" + a.size() +" left on the stack)");
	}
}
