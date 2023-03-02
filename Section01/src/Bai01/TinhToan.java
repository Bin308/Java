package Bai01;

public class TinhToan {
		public static void main(String[] args) {
			tong(10,15);
			hieu(73,52);
			tich(12f,15);
			//thuong(15,76f);
			System.out.println(thuong(15,76f));
		}
		public static void tong(int a,int b) {
			int t = a + b;
			System.out.println(t);
		}
		public static void hieu(int a,int b) {
			int h = a - b;
			System.out.println(h);
		}
		public static void tich( float a, int b) {
			float ti = a * b;
			System.out.println(ti);
		}
		public static float thuong(int a,float b) {
			float th = a / b;
			//System.out.println(th);
			return th;
		}
	}


