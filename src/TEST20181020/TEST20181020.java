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
	 * 课本P47练习题：求矩形面积周长
	 */
	public void testJuXing() {
		
		//定义矩形类对象
		JUXING jx = new JUXING();
		
		//将输入长宽赋值给矩形类变量长、宽
		System.out.println("请输入矩形边长：");
		Scanner sc = new Scanner(System.in);
		jx.setLen(sc.nextDouble());
		System.out.println("请输入矩形边宽：");
		jx.setWid(sc.nextDouble());
		
		//调用矩形类对象中方法，计算面积、周长并输出
		double area = jx.countArea();
		double girth = jx.countGirth();
		System.out.println("矩形面积="+area);
		System.out.println("矩形周长="+girth);
		sc.close();
	}

	/**
	 * 课本P46例子：4.1.2 例4.1
	 */
	public void testCircle() {
		Circle c1 = new Circle();//第一个圆
		c1.setRadius(10);
		System.out.println("c1圆面积="+c1.getArea());
		System.out.println("c1圆周长="+c1.getPerimeter());
		
		Circle c2 = new Circle();//第二个圆
		c2.setRadius(20);
		System.out.println("c2圆面积="+c2.getArea());
		System.out.println("c2圆周长="+c2.getPerimeter());
		
		c1.setRadius(30);//重新复制第一个圆半径并重新计算面积、周长
		
		System.out.println("c1重新赋值半径后圆面积="+c1.getArea());
		System.out.println("c1重新赋值半径后圆周长="+c1.getPerimeter());
	}
	
	/**
	 * P55 练习，重新修改JUXING类增加中心坐标以及构造方法后，重新调用
	 */
	public void testJuXing2() {
		JUXING j1 = new JUXING();
		JUXING j2 = new JUXING(20,30);
		JUXING j3 = new JUXING(j2);
		
		//j1
		System.out.println("j1.len="+j1.getLen());
		System.out.println("j1.wid="+j1.getWid());
		System.out.println("j1面积="+j1.countArea());
		System.out.println("j1周长="+j1.countGirth());
		System.out.println("j1中心坐标x="+j1.getX());
		System.out.println("j1中心坐标y="+j1.getWid());
		
		//j2
		System.out.println("j2.len="+j2.getLen());
		System.out.println("j2.wid="+j2.getWid());
		System.out.println("j2面积="+j2.countArea());
		System.out.println("j2周长="+j2.countGirth());
		System.out.println("j2中心坐标x="+j2.getX());
		System.out.println("j2中心坐标y="+j2.getWid());
		
		//j2
		System.out.println("j3.len="+j3.getLen());
		System.out.println("j3.wid="+j3.getWid());
		System.out.println("j3面积="+j3.countArea());
		System.out.println("j3周长="+j3.countGirth());
		System.out.println("j3中心坐标x="+j3.getX());
		System.out.println("j3中心坐标y="+j3.getWid());
	}
}
