import java.io.*;
import java.util.*;
public class PrimeFactor {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
long a;
a=s.nextLong();
long pr=-1;
while(a%2==0) {
pr=2;
a>>=1;
}
while(a%3==0) {
pr=3;
a=a/3;
}
for(int i=5;i<=Math.sqrt(a);i+=6) {
while(a%i==0) {
pr=i;
a=a/i;
}
while(a%(i+2)==0) {
pr=i+2;
a=a/(i+2);
}
}
if(a>4) {
pr=a;
}
System.out.println(pr);
}

}