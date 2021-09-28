import java.io.*;
import java.util.*;
public class Sumsquare
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b= (a*(a+1)*(2*a+1))/6;
System.out.println(b);
int i,sum=0;
for(i = 1; i <= a; ++i)
{
sum=sum+i;
}
int sc=sum*sum;
System.out.println(sc);
int d=sc-b;
System.out.println(d);
}
} 