package TEST;

import java.util.Scanner;

public class HELLO {

	/**
	 * ������
	 * @author zhaoNing
	 * @param args
	 */
	//main����
	public static void main(String[] args) {
		//�������
//		HELLO.test();//20180908������ϰ
//		HELLO.testScanner();//20180908������ϰ
//		HELLO.testType();//20180915�Ͽ���ϰ-������������
		//HELLO.testTypeZuoYe();
		
	}
	
	/**
	 * 20180908������ϰ
	 * test1 ��ϰ���
	 */
	public static void test() {
		int x = 1;
		int y = 2;
		int z = x+y;
		// �����̨���
		System.out.println("Hello �������������");
		System.out.println("x="+x+";y="+y+";z="+z);
		System.out.println(x+y+z);
	}
	
	/**
	 * 20180908������ϰ
	 * testScanner ��ϰ����̨����+���
	 */
	public static void testScanner() {
//		int price = 30;
//		int amount = 100;
		int price ;
		int amount ;
		int count;
		Scanner sc = new Scanner(System.in);//����������
		System.out.println("��������Ʒ�۸�");
		price = sc.nextInt();
		System.out.println("��������Ʒ������");
		count = sc.nextInt();
		System.out.println("��������ֵ��");
		amount = sc.nextInt();
		sc.close();//�ر�������
		
		// �����̨���
		System.out.println("�ܽ�"+amount+"Ԫ;��Ʒ�۸�"+price*count+"Ԫ;���㣺"+(amount-price*count)+"Ԫ;");
	}
	
	/**
	 * 20180915�Ͽ���ϰ-������������(�������)
	 */
	public static void  testType() {
//		��ֵ����
		byte a=1;
		short b = 2;
		int c = 2;
		long d = 3L;
//		����������
		float e = 2.3f;
		double f = 4.56;
//		�ַ�����
		char g = 'n';
//		��������
		boolean h;
		if(a>0) {
			h = true;
		}else {
			h = false;
		}
		
//		 �������ֵ
		System.out.println("a="+a+", Byte��Χ����Сֵ="+Byte.MIN_VALUE+",���ֵ="+Byte.MAX_VALUE);
		System.out.println("b="+b+", short��Χ����Сֵ="+Short.MIN_VALUE+",���ֵ="+Short.MAX_VALUE);
		System.out.println("c="+c+", long��Χ����Сֵ="+Long.MIN_VALUE+",���ֵ="+Long.MAX_VALUE);
		System.out.println("d="+d+", int��Χ����Сֵ="+Integer.MIN_VALUE+",���ֵ="+Integer.MAX_VALUE);
		System.out.println("e="+e+", float��Χ����Сֵ="+Float.MIN_VALUE+",���ֵ="+Float.MAX_VALUE);
		System.out.println("f="+f+", double��Χ����Сֵ="+Double.MIN_VALUE+",���ֵ="+Double.MAX_VALUE);
		System.out.println("g="+g+", char��Χ����Сֵ="+Character.MIN_VALUE+",���ֵ="+Character.MAX_VALUE+"����Χ��Ϊ��ֵ��ʾΪ����Сֵ="+(int)Character.MIN_VALUE+",���ֵ="+(int)Character.MAX_VALUE);
		System.out.println("h="+h);
		System.out.println("(a+b)="+(a+b));
		System.out.println("+a+b="+a+b);
		System.out.println("(a+b+c)="+(a+b+c));
		System.out.println("+a+b+c="+a+b+c);
	}
	
	/**
	 * 20180915�Ͽ���ϰ-���϶Ⱥͻ��϶�ת��
	 */
	public static void  testScanner2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������϶�");
	}
	
	
	/***
	 * ������ҵ
	 */
	public static void  testTypeZuoYe() {
		/*char cc;
		short shTmp;
		shTmp = 0x41;
		cc = (char)shTmp;
		System.out.println("�ַ�����cc="+cc);
		
		final int X = 5;
		final double Y = 2.5;
		final long Z;
		final float Mark = 3.2F;
		Z = 100L;
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		System.out.println("Z="+Z);
		System.out.println("Mark="+Mark);
		
		System.out.println("��������ַ���"+"'��'");
		System.out.println("������з���"+'\n');
		System.out.println("�����б�ܣ�"+'\\');
		System.out.println("��������ţ�"+'\'');
		System.out.println("���˫���ţ�"+'\"');
		System.out.println("����ַ�A��"+'\u0041');
		
		    byte bv;
			short sv;
			int iv;
			long lv;
			bv = 123;
			sv = 0100;//�˽���
			iv = 0x1234;//ʮ������
			lv = -123456879658L;
//			�������ֵ
			System.out.println("�ֽ��ͱ���bv="+bv);
			System.out.println("�����ͱ���sv="+sv);
			System.out.println("�����ͱ���sv="+sv);
			System.out.println("�����ͱ���iv="+iv);
			System.out.println("�����ͱ���lv="+lv);
			
			//%ȡ��
			System.out.println("5%3="+5%3);
			System.out.println("5%-3="+5%-3);
			System.out.println("-5%3="+-5%3);
			System.out.println("-5%-3="+-5%-3);
			
			byte bt;
			bt = 123;
			bt++;
			System.out.println("�ֽ��ͱ���bt="+bt);
			System.out.println("++bt="+(++bt));
			*/
		String a = "www",b="org";
		int c = 666;
		String d = a+"bbb"+c;
		System.out.println(d);
	}
	
	
}
