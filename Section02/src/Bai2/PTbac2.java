package Bai2;

import java.util.Scanner;

public class PTbac2 {
//ax2 + bx + c =0
//neu a=0 thi nghiem la x=-c/b
//neu a!=0 tinh delta = b2 - 4ac
//neu delta < 0 phuong trinh vo nghiem
//delta = 0 thi x = -b / 2a
//delta >0 thi x1 = (-b - can(delta)) / 2a, x2 = (-b + can(delta)) / 2a
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap gia tri cua a:");
		int a = scan.nextInt();
		System.out.print("Nhap gia tri cua b:");
		int b = scan.nextInt();
		System.out.print("Nhap gia tri cua c:");
		int c = scan.nextInt();
		
		if(a==0) {
			System.out.println("Phuong trinh có nghiem la:x = " + (-c/b));
		}else {
			int delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem leu leu:");
			}
			else if (delta ==0) {
				System.out.println("Phuong trinh có nghiem kep la:x = " + (-b/2*a));
			}else {
				System.out.println("Phuong trinh có nghiem la:x1 = " + (-b -(sqrt(delta)))/(2*a));
				System.out.println("Phuong trinh có nghiem la:x1 = " + (-b +(sqrt(delta)))/(2*a));
			}
		}
	}

	private static int sqrt(int delta) {
		// TODO Auto-generated method stub
		return 0;
	}
}
