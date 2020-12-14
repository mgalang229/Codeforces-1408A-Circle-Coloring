import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextInt();
			for(int i=0; i<n; ++i)
				b[i]=in.nextInt();
			for(int i=0; i<n; ++i)
				c[i]=in.nextInt();
			int f=a[0];
			out.print(f);
			int p=f;
			for(int i=1; i<n; ++i) {
				if(a[i]!=p&&a[i]!=f) {
					out.print(" "+a[i]);
					p=a[i];
				} else if(b[i]!=p&&b[i]!=f) {
					out.print(" "+b[i]);
					p=b[i];
				} else if(c[i]!=p&&c[i]!=f) {
					out.print(" "+c[i]);
					p=c[i];
				}
			}
			out.println();
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
