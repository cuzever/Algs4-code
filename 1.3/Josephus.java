//package alg4_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Josephus {
	public static void main(String[] args) {
		Queue<Integer> queue= new Queue<Integer>();
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		for(int i=0;i<n;i++) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			for(int i=0;i<m;i++) {
				queue.enqueue(queue.dequeue());
			}
			StdOut.print(queue.dequeue()+" ");
		}
		
	}
}
