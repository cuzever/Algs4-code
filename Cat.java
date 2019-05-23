import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Cat {
	public static void main(String[] args) {
		Out out = new Out(args[2]);
		for (int i=0;i<2;i++) {
			In in =new In(args[i]) ;
			String s = in.readAll();
			out.println(s);
			in.close();
		}
		out.close();
	}
}
