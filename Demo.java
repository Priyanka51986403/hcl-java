package com.hcl;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	int billno,date;
	Scanner sc=new Scanner(System.in);
	billno=sc.nextInt();
	System.out.println("enter the bill no :");
	date=sc.nextInt();
	if(billno%100==date||billno%10==date) {
		System.out.println("Lucky Customer");
		}
	else
	{
		System.out.println("Better lucky next time");
		}
	}
}
