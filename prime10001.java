import java.io.*;
public class prime10001 {
public static void main(String[] args) {
int i = 0;
int c = 1;
while (c <= 10001) {
if (IsPrime(i)) {
c++;
}
i++;
}
System.out.println(i);
}
public static boolean IsPrime(long x) {
if (x<2) return false;
if (x<=3) return true;
for (long j = 2; j <= Math.sqrt(x) + 1; ++ j) 
if (x % j == 0) return false;
return true;
}
	
		
	

}