package TEST;

public class BitwiseOperatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 位与&
		int a = 15; // a等于二进制数的00001111
		int b = 6; // b等于二进制数的00000110
		System.out.println("位与&  : " + (a & b));// 等于二进制数的00000110
		
		// 左移<<
		int a1 = 15;
		int b1 = 2;
		int c1 = a << b1;// 等于00111100；
		System.out.println("左移" + c1);
		
		// 右移>>
		int a2 = 15;
		int b2 = 2;
		int c2 = a >> b2;// 等于00111100；
		System.out.println("右移>>: " + c2);
		
		// 补运算 ~
		int a3 = 15;// 00010110;
		int c3 = ~a3;
		System.out.println("补运算 ~ ：  " + c3);
		
		// 异或运算
		int a4 = 15;
		int b4 = 2;
		System.out.println("异或运算 :  " + (a4 ^ b4));
	
		// >>>无符号右移
		int a5 = -1;
		int b5 = a5 >>> 1;
		System.out.println(">>>无符号右移: " + b5);
	}
}
