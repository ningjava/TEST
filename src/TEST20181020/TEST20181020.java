package TEST20181020;

import java.util.Scanner;

public class TEST20181020 {

	public static void main(String[] args) {
		TEST20181020 ts = new TEST20181020();
//		ts.testJuXing();
//		ts.testCircle();
		ts.testJuXing2();
	}
	
	/**
	 * �α�P47��ϰ�⣺���������ܳ�
	 */
	public void testJuXing() {
		
		//������������
		JUXING jx = new JUXING();
		
		//�����볤��ֵ�����������������
		System.out.println("��������α߳���");
		Scanner sc = new Scanner(System.in);
		jx.setLen(sc.nextDouble());
		System.out.println("��������α߿�");
		jx.setWid(sc.nextDouble());
		
		//���þ���������з���������������ܳ������
		double area = jx.countArea();
		double girth = jx.countGirth();
		System.out.println("�������="+area);
		System.out.println("�����ܳ�="+girth);
		sc.close();
	}

	/**
	 * �α�P46���ӣ�4.1.2 ��4.1
	 */
	public void testCircle() {
		Circle c1 = new Circle();//��һ��Բ
		c1.setRadius(10);
		System.out.println("c1Բ���="+c1.getArea());
		System.out.println("c1Բ�ܳ�="+c1.getPerimeter());
		
		Circle c2 = new Circle();//�ڶ���Բ
		c2.setRadius(20);
		System.out.println("c2Բ���="+c2.getArea());
		System.out.println("c2Բ�ܳ�="+c2.getPerimeter());
		
		c1.setRadius(30);//���¸��Ƶ�һ��Բ�뾶�����¼���������ܳ�
		
		System.out.println("c1���¸�ֵ�뾶��Բ���="+c1.getArea());
		System.out.println("c1���¸�ֵ�뾶��Բ�ܳ�="+c1.getPerimeter());
	}
	
	/**
	 * P55 ��ϰ�������޸�JUXING���������������Լ����췽�������µ���
	 */
	public void testJuXing2() {
		JUXING j1 = new JUXING();
		JUXING j2 = new JUXING(20,30);
		JUXING j3 = new JUXING(j2);
		
		//j1
		System.out.println("j1.len="+j1.getLen());
		System.out.println("j1.wid="+j1.getWid());
		System.out.println("j1���="+j1.countArea());
		System.out.println("j1�ܳ�="+j1.countGirth());
		System.out.println("j1��������x="+j1.getX());
		System.out.println("j1��������y="+j1.getWid());
		
		//j2
		System.out.println("j2.len="+j2.getLen());
		System.out.println("j2.wid="+j2.getWid());
		System.out.println("j2���="+j2.countArea());
		System.out.println("j2�ܳ�="+j2.countGirth());
		System.out.println("j2��������x="+j2.getX());
		System.out.println("j2��������y="+j2.getWid());
		
		//j2
		System.out.println("j3.len="+j3.getLen());
		System.out.println("j3.wid="+j3.getWid());
		System.out.println("j3���="+j3.countArea());
		System.out.println("j3�ܳ�="+j3.countGirth());
		System.out.println("j3��������x="+j3.getX());
		System.out.println("j3��������y="+j3.getWid());
	}
}
