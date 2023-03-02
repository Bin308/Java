package Bai4;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class tinhTuoi {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Nhap so tuoi:");
		int age = Scan.nextInt();
		
		if(age<1) {
			System.out.println("Tre so sinh");
		}else if(age>=1 && age <=3) {
			System.out.println("Em be");
		}else if(age>=3 && age <18) {
			System.out.println("Tre em");
		}else if(age==18) {
			System.out.println("Nguoi lon");
		}else if(age>=40 && age <60) {
			System.out.println("Trung nien");
		}else if(age >=60) {
			System.out.println("Nguoi gia");
		}
	}
}
