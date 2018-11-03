package TEST20180922;

import java.util.Scanner;
/**
 * @title 20180922课后作业
 * @author 赵宁
 * @班级  继续本18
 * @学号 118992215
 */
public class ZUOYE20180922 {

	public static void main(String[] args) {
		//1、计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
		ZUOYE20180922.testPingFang();
		//2、输出下乘法表。
		ZUOYE20180922.testCFB();
		//3、计算a到b之间所有的奇数和和偶数和并输出（a、b取值自定，值差大于50）。
		ZUOYE20180922.testJOSHU();
		//4、假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，则输出“移动”、如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。如果输入的其他手机号，则输出“未知运营商”。（if、switch）
		ZUOYE20180922.testPhoneNo();
		//5、编写程序实现对给定的4个整数从大到小的顺序排序。
		ZUOYE20180922.testOrder();
	}
	
	//1、计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
	public static void testPingFang() {
		//换成do..while
		int sum=0;
		int m=1;
		for(m=1;;m++) {
			sum+=m*m;
			if(sum>5000) {System.out.println("作业1：平方和sum="+sum+";m="+m);break;};
		}
	}

	/*2、输出如下乘法表。
	 1×1= 1
	 2×1= 2 2×2= 4
	 3×1= 3 3×2= 6 3×3= 9
	 4×1= 4 4×2= 8 4×3=12 4×4=16
	 5×1= 5 5×2=10 5×3=15 5×4=20 5×5=25
	 6×1= 6 6×2=12 6×3=18 6×4=24 6×5=30 6×6=36
	 7×1= 7 7×2=14 7×3=21 7×4=28 7×5=35 7×6=42 7×7=49
	 8×1= 8 8×2=16 8×3=24 8×4=32 8×5=40 8×6=48 8×7=56 8×8=64
	 9×1= 9 9×2=18 9×3=27 9×4=36 9×5=45 9×6=54 9×7=63 9×8=72 9×9=81*/
	public static void testCFB() {
		System.out.println("作业2：乘法表：");
		for(int i = 1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"x"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}
	
	//3、计算a到b之间所有的奇数和和偶数和并输出（a、b取值自定，值差大于50）。
	public static void testJOSHU() {
		int a = 666,b = 888,sumJ = 0,sumO=0;
		for(int i = a;i<=b;i++) {
			if(i%2==0)sumO+=i;
			if(i%3==0)sumJ+=i;
		}
		System.out.println("作业三：a="+a+",b="+b+";ab之间奇数和="+sumJ+";ab之间偶数和="+sumO);
	}
	//4、假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，则输出“移动”、如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。如果输入的其他手机号，则输出“未知运营商”。（if、switch）
	public static void testPhoneNo() {
		final String YD="136,137,138,139";
		final String DX="130,131,133";
		final String LT="186,188";
		Scanner sc = new Scanner(System.in);
		System.out.println("作业4：请输入3位以上手机号：");
		String phoneNo = sc.nextLine();
		if(phoneNo==null || phoneNo.length()<3)
			System.out.println("输入错误，请输入3位以上手机号：");
		else {
			String first3 = phoneNo.substring(0, 3);
			System.out.println("您输入的手机号前3位是"+first3);
			if(YD.contains(first3)) {System.out.println("移动");return;}
			if(DX.contains(first3)) {System.out.println("电信");return;}
			if(LT.contains(first3)) {System.out.println("联通");return;}
			System.out.println("其他运营商");
		}
	}
	//5、编写程序实现对给定的4个整数从大到小的顺序排序。
	public static void testOrder() {
		int[] array = new int[4];
		array[0] = 666;
		array[1] = 888;
		array[2] = 222;
		array[3] = 999;
		int a = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					a = array[j];
					array[j] = array[j + 1];
					array[j + 1] = a;
				}
			}
		}
		System.out.println("作业5：从大到小的顺序排序后为：");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
