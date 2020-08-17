package week7;

import java.util.Scanner;

public class GetUserInfo {
	public static void main(String[]arg) {
		String name;
		int age;
		int a,b,c;
		a=5;
		b=10;
		c=20;
		int total=a*b+c;
		int total2=a+b*c;
		float total3=a/b*c;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Pleas enter your name >> ");
		name = inputDevice.nextLine();
		System.out.println("Pleas enter your age >> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is "+name);
		System.out.println("age "+age);
		System.out.println("Total a*b+c = "+total);
		System.out.println("Total a+b*c = "+total2);
		System.out.println("Total a/b*c = "+total3);
	}
}
