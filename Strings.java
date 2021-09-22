import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("");
		sb.append("Hello");
		sb.append("World");
		sb.insert(5, "_Java");
		sb.replace(5,6," ");
		System.out.println(sb.charAt(6));
		sb.deleteCharAt(3);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		
		

	}

}