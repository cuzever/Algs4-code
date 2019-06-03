package alg4_1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
////quick-find
//public class UF {
//	private int[] id;
//	private int count;
//	public UF(int N) {
//		count = N;
//		id = new int[N];
//		for (int i = 0;i<N;i++)
//			id[i]=i;
//	}
//	public int count() {
//		return count;
//	}
//	public boolean connected(int p,int q) {
//		return find(p) == find(q);
//	}
//	private int find(int p) {
//		return id[p];
//	}
//	public void union(int p,int q) {
//		int pID = find(p);
//		int qID = find(q);
//		
//		if(pID==qID) return;
//		else {
//			for(int i=0;i<id.length;i++)
//				if(id[i]==pID) id[i]=qID;
//		}
//		count--;
//	}
//	public static void main(String[] args) {
//		int N = StdIn.readInt();
//		UF uf = new UF(N);
//		while(!StdIn.isEmpty()) {
//			int p = StdIn.readInt();
//			int q = StdIn.readInt();
//			if(uf.connected(p, q)) continue;
//			uf.union(p, q);
//			StdOut.println(p+" "+q);
//		}
//		StdOut.println(uf.count()+"components");
//	}
//}
//union-find
public class UF {
	private int[] id;
	private int count;
	public UF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0;i<N;i++)
			id[i]=i;
	}
	public int count() {
		return count;
	}
	public boolean connected(int p,int q) {
		return find(p) == find(q);
	}
	private int find(int p) {
		while(p!=id[p]) p = id[p];
		return p;
	}
	public void union(int p,int q) {
		int pRoot = find(p);
		int qRoot = find(q);
		if(pRoot==qRoot) return;
		id[pRoot]=qRoot;
		count--;
	}
	public static void main(String[] args) {
		int N = StdIn.readInt();
		UF uf = new UF(N);
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(uf.connected(p, q)) continue;
			uf.union(p, q);
			StdOut.println(p+" "+q);
		}
		StdOut.println(uf.count()+"components");
	}
}