package TEST;

import java.util.Scanner;

public class HELLO {

	/**
	 * 主方法
	 * @author zhaoNing
	 * @param args
	 */
	//main方法
	public static void main(String[] args) {
		//定义变量
//		HELLO.test();//20180908课上练习
//		HELLO.testScanner();//20180908课上练习
//		HELLO.testType();//20180915上课练习-基本数据类型
		//HELLO.testTypeZuoYe();
		
	}
	
	/**
	 * 20180908课上练习
	 * test1 练习输出
	 */
	public static void test() {
		int x = 1;
		int y = 2;
		int z = x+y;
		// 向控制台输出
		System.out.println("Hello 面向对象程序设计");
		System.out.println("x="+x+";y="+y+";z="+z);
		System.out.println(x+y+z);
	}
	
	/**
	 * 20180908课上练习
	 * testScanner 练习控制台输入+输出
	 */
	public static void testScanner() {
//		int price = 30;
//		int amount = 100;
		int price ;
		int amount ;
		int count;
		Scanner sc = new Scanner(System.in);//定义输入流
		System.out.println("请输入商品价格：");
		price = sc.nextInt();
		System.out.println("请输入商品数量：");
		count = sc.nextInt();
		System.out.println("请输入面值：");
		amount = sc.nextInt();
		sc.close();//关闭输入流
		
		// 向控制台输出
		System.out.println("总金额："+amount+"元;商品价格："+price*count+"元;找零："+(amount-price*count)+"元;");
	}
	
	/**
	 * 20180915上课练习-基本数据类型(四类八种)
	 */
	public static void  testType() {
//		数值类型
		byte a=1;
		short b = 2;
		int c = 2;
		long d = 3L;
//		浮点数类型
		float e = 2.3f;
		double f = 4.56;
//		字符类型
		char g = 'n';
//		布尔类型
		boolean h;
		if(a>0) {
			h = true;
		}else {
			h = false;
		}
		
//		 输出各个值
		System.out.println("a="+a+", Byte范围：最小值="+Byte.MIN_VALUE+",最大值="+Byte.MAX_VALUE);
		System.out.println("b="+b+", short范围：最小值="+Short.MIN_VALUE+",最大值="+Short.MAX_VALUE);
		System.out.println("c="+c+", long范围：最小值="+Long.MIN_VALUE+",最大值="+Long.MAX_VALUE);
		System.out.println("d="+d+", int范围：最小值="+Integer.MIN_VALUE+",最大值="+Integer.MAX_VALUE);
		System.out.println("e="+e+", float范围：最小值="+Float.MIN_VALUE+",最大值="+Float.MAX_VALUE);
		System.out.println("f="+f+", double范围：最小值="+Double.MIN_VALUE+",最大值="+Double.MAX_VALUE);
		System.out.println("g="+g+", char范围：最小值="+Character.MIN_VALUE+",最大值="+Character.MAX_VALUE+"；范围改为数值表示为：最小值="+(int)Character.MIN_VALUE+",最大值="+(int)Character.MAX_VALUE);
		System.out.println("h="+h);
		System.out.println("(a+b)="+(a+b));
		System.out.println("+a+b="+a+b);
		System.out.println("(a+b+c)="+(a+b+c));
		System.out.println("+a+b+c="+a+b+c);
	}
	
	/**
	 * 20180915上课练习-摄氏度和华氏度转换
	 */
	public static void  testScanner2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入摄氏度");
	}
	
	
	/***
	 * 课堂作业
	 */
	public static void  testTypeZuoYe() {
		/*char cc;
		short shTmp;
		shTmp = 0x41;
		cc = (char)shTmp;
		System.out.println("字符变量cc="+cc);
		
		final int X = 5;
		final double Y = 2.5;
		final long Z;
		final float Mark = 3.2F;
		Z = 100L;
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		System.out.println("Z="+Z);
		System.out.println("Mark="+Mark);
		
		System.out.println("输出汉字字符："+"'好'");
		System.out.println("输出换行符："+'\n');
		System.out.println("输出反斜杠："+'\\');
		System.out.println("输出单引号："+'\'');
		System.out.println("输出双引号："+'\"');
		System.out.println("输出字符A："+'\u0041');
		
		    byte bv;
			short sv;
			int iv;
			long lv;
			bv = 123;
			sv = 0100;//八进制
			iv = 0x1234;//十六进制
			lv = -123456879658L;
//			输出以上值
			System.out.println("字节型变量bv="+bv);
			System.out.println("短整型变量sv="+sv);
			System.out.println("基本型变量sv="+sv);
			System.out.println("基本型变量iv="+iv);
			System.out.println("长整型变量lv="+lv);
			
			//%取余
			System.out.println("5%3="+5%3);
			System.out.println("5%-3="+5%-3);
			System.out.println("-5%3="+-5%3);
			System.out.println("-5%-3="+-5%-3);
			
			byte bt;
			bt = 123;
			bt++;
			System.out.println("字节型变量bt="+bt);
			System.out.println("++bt="+(++bt));
			*/
		String a = "www",b="org";
		int c = 666;
		String d = a+"bbb"+c;
		System.out.println(d);
	}
	
	
}
