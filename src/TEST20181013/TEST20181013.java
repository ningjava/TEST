package TEST20181013;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TEST20181013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEST20181013 t = new TEST20181013();
//		t.test99999();
		
		//overload
		// 调用test()时没有传入参数，因此系统调用上面没有参数的test()方法。
//		t.test();
		// 调用test()时传入了一个字符串参数，
		// 因此系统调用上面带一个字符串参数的test()方法。
//		t.test("hello");
		
		//使用方法重载方式实现计算矩形周长和圆周长的方法。
		t.testYZCandJXZC(10,6);
		t.testYZCandJXZC(10);
	}

	/**
	 * 课堂作业：编写程序，从键盘输入一个 0~99999 之间的任意数，判断输入的数是几位数？
	 */
	public void test99999(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" 请输入正确的0~99999 之间的任意数:");
		String inputA = sc.nextLine();
		Pattern pattern=Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d)*)?$"); 
		try {
			boolean b =  pattern.matcher(inputA).matches(); 
			if(!b) {
				System.out.println(" 输入数据格式有误，请输入正确的0~99999 之间的任意数!");
				this.test99999();
			}else{
				double dd = Double.parseDouble(inputA);
				if(dd<0||dd>99999) {
					System.out.println(" 数据范围有误，请输入正确的0~99999 之间的任意数!");
					this.test99999();
				}else {
					System.out.println(inputA.length());
				}
			}
		}catch(Exception e) {
			System.out.println(" 输入数据格式有误，请输入正确的0~99999 之间的任意数!");
			this.test99999();
		}
	}
	/**
	 * 重载Overload
	 * @author Administrator
	 *
	 */
	// 下面定义了两个test()方法，但方法的形参列表不同
	// 系统可以区分这两个方法，这种被称为方法重载
	public void test()
	{
		System.out.println("无参数");
	}
	public void test(String msg)
	{
		System.out.println("重载的test方法 " + msg);
	}
	
	/**
	 * 课堂练习：使用方法重载方式实现计算矩形周长和圆周长的方法。
	 */
	public void testYZCandJXZC(double l,double w) {
		 DecimalFormat dFormat = new DecimalFormat("#.00");
         String yearString = dFormat.format(2*(l+w));
         System.out.println("长："+l+";宽："+w+";周长="+Double.valueOf(yearString));
	}
	public void testYZCandJXZC(double r) {
		DecimalFormat dFormat = new DecimalFormat("#.00");
        String yearString = dFormat.format(2*Math.PI*r);
		System.out.println("圆半径："+r+";圆周长="+Double.valueOf(yearString));
	}
	
	
}
