package Bai3;

import java.util.Scanner;

public class tracnhiem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Chon dap an:");
		System.out.println("1-Dien tich hinh vuong:");
		System.out.println("2-Chu vi hinh vuong:");
		System.out.println("3-Dien tich hinh chu nhat:");
		System.out.println("4-Chu vi hinh chu nhat:");
		int x = scan.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Ban da chon dap an 1.");
			System.out.print("Dien kich thuoc canh hinh vuong:");
			float canhHinhVuong = scan.nextFloat();
			System.out.print("Dien tich hinh vuongla" + hinhVuong.dienTich(canhHinhVuong));
			break;
		case 2:
			System.out.println("Ban da chon dap an 2.");
			System.out.print("Dien kich thuoc canh hinh vuong:");
			float canhHinhVuong1 = scan.nextFloat();
			System.out.print("Dien tich hinh vuongla" + hinhVuong.chuVi(canhHinhVuong1));
			break;
		case 3:
			System.out.println("Ban da chon dap an 3.");
			System.out.print("Dien kich thuoc chieu dai:");
			int chieuDai = scan.nextInt();
			System.out.print("Dien kich thuoc chieu rong:");
			int chieuRong = scan.nextInt();
			System.out.print("Dien tich hinh chu nhat la:" + hinhChuNhat.dienTich(chieuDai, chieuRong));
			break;
		case 4:
			System.out.println("Ban da chon dap an 4.");
			System.out.print("Dien kich thuoc chieu dai:");
			int chieuDai1 = scan.nextInt();
			System.out.print("Dien kich thuoc chieu rong:");
			int chieuRong1 = scan.nextInt();
			System.out.print("Chu vi hinh chu nhat la:" + hinhChuNhat.chuVi(chieuDai1, chieuRong1));
			break;
		}
	}
}
