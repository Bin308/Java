package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a1 = 1;
		int b1 = 2;
		System.out.println("Tong cua a1 va b1 la: ");
		System.out.println(tinhToan.tong(a1, b1));

		int a2 = 30;
		int b2 = 8;
		System.out.println("Hieu cua a2 va b2 la: ");
		System.out.println(tinhToan.hieu(a2, b2));

		int a3 = 25;
		int b3 = 45;
		System.out.println("Tich cua a3 va b3 la: ");
		System.out.println(tinhToan.tich(a3, b3));

		int a4 = 8;
		int b4 = 4;
		System.out.println("Thuong cua a4 va b4 la: ");
		System.out.println(tinhToan.thuong(a4,b4));
		
		System.out.println("Vui long nhap gi tri cua a:");
		Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 
		System.out.println("Binh phuong cua a la:" + tinhToan.binhPhuong(a));
		System.out.println("Can bac hai cua a la:" + tinhToan.canBac2(a));
		System.out.println("Tich cua a vs Pi la:" + tinhToan.tichPiVaA(a));

	}
}
