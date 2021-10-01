import java.io.*;
import java.util.*;
public class Pythagorean
{
static void pythagorean(int n)
{
for(int i=1;i<=n/3;i++)
{
for(int j=i+1;j<=n/2;j++)
{
int k=n-i-j;
if(i*i+j*j==k*k)
{
System.out.println(i+", "+j+", "+k);
return;
}
}
}
System.out.println("No Triplet");
}
public static void main(String[] args)
{
int n=1000;
pythagorean(n);
}
}
