package Bai1;

import java.util.Scanner;

public class SoLonSoBe {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap gia tri cua a:");
		int a = scan.nextInt();
		System.out.println("Nhap gia tri cua b:");
		int b = scan.nextInt();
		System.out.println("Nhap gia tri cua c:");
		int c = scan.nextInt();
		
		
		
		
		
//		if (a >= b && a >= c){
//			System.out.println("So lon nhat la:" + a );
//		}
//		if(b >= a && b >= c) {
//			System.out.println("So lon nhat la:" + b );
//			}
		int max = a;
		int min = a;
		max = b > max ? b : max;
		max = c > max ? c : max;
		if(a>b) {
			min=b;
		}
		if(min > c) {
			min=c;
		}
		System.out.println("So lon nhat la:" + max);
		System.out.println("So nho nhat la:" + min);
	}
}
