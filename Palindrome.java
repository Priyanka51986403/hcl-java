import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		int value=0;
		for(int i=100;i<=999;i++) {
			for(int j=i;j<=999;j++) {
				int m=j*i;
				StringBuilder sb=new StringBuilder(""+m);
				String b=""+m;
				sb.reverse();
				if(b.equals(sb.toString())&&value<m) {
					value=m;
				}
			}
		}
		System.out.println(value);
	}

}
