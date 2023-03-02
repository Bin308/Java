package Bai02;

public class Main {

	public static void main(String[] args) {
		// tinh Chu vi va Dien tich hinh vuong
		float canhHinhVuong = 3.2f;

		System.out.println("Chu vi va dien tich hinh vuong la :");
		System.out.println(HinhVuong.chuVi(canhHinhVuong));

		System.out.println(HinhVuong.dienTich(canhHinhVuong));

		// tinh Chu vi va Dien tich hinh tron
		float banKinh = 2.4f;

		System.out.println("Chu vi ve dien tich hinh tron la :");
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println(HinhTron.dienTich(banKinh));

		// tinh Chu vi va Dien tich hinh chu nhat
		float chieuDai = 2.1f;
		float chieuRong = 2.3f;

		System.out.println("Chu vi va dien tich hinh chu nhat la :");
		System.out.println(HinhChuNhat.chuVi(chieuDai, chieuRong));
		System.out.println(HinhChuNhat.dienTich(chieuDai, chieuRong));

		// tinh Chu vi va Dien tich hinh tam giac vuong
		float canhGocVuongT1 = 3f;
		float canhGocVuongT2 = 4f;
		float canhHuyen = 5f;

		System.out.println("Chu vi va dien tich hinh tam giac vuong la :");
		System.out.println(HinhTamGiac.chuVi(canhGocVuongT1, canhGocVuongT2, canhHuyen));
		System.out.println(HinhTamGiac.dienTich(canhGocVuongT1, canhGocVuongT2));
	}
}
