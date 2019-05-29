package alg4_1_3;

public class ResizingArrayQueueOfStrings {
	private String a[] = new String[1];
	private int N = 0;
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {
		String[] temp = new String[max];
		for (int i=0;i<N;i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	public void push(String str) {
		if (a.length==N) resize(2*a.length);
		a[N++] = str;
	}
	public String pop() {
		String p = a[0];
		for (int i = 0;i<a.length;i++) {
			a[i] = a[i+1];
		}
		N--;
		if (N>0&&N==a.length/4) resize(a.length/2);
		return a[0];
	}
	
}
