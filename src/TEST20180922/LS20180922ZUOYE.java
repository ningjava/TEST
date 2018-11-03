package TEST20180922;

import java.util.Scanner;

/**
 * @title 20180922课堂作业
 * @author 赵宁 
 * @班级  继续本18
 * @学号 118992215
 *
 */
public class LS20180922ZUOYE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2、输入不同分值，判断并输出该成绩的优良中差等级。
		LS20180922ZUOYE.testIfElse();
		LS20180922ZUOYE.testSwitch();
		//3、用for、while、do..while分别计算1到100的和
		LS20180922ZUOYE.sum1To100();
		//6、图形1、2
		LS20180922ZUOYE.testTU();
		//7、求1到100不能被3整除的整数之和。
		LS20180922ZUOYE.testSumBut3();
	}
	/**
	 * 2、输入不同分值，判断并输出该成绩的优良中差等级。
	 */
	//IF ELSE 方式
	public static void testIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩1：");
		int s = sc.nextInt();
		if(s >=90)
			System.out.println("优");
	    else  if(s >=80)
	    	 System.out.println("良");
	    else  if(s >=70)
	    	System.out.println("中");
	    else  if(s >=60)
	        System.out.println("及格");
	    else
	        System.out.println("差");
		System.out.println();
	}
	
	//SWITCH CASE 方式
	public static void testSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩2：");
		int s = sc.nextInt();
		int i =s/10;
//		System.out.println("i="+i);
		//如果下面不加break，会一直往后面执行case
		switch(i){
			case 10:
			case 9:System.out.print("优");break;
			case 8:System.out.print("良");break;
			case 7:System.out.print("中");break;
			case 6:System.out.print("及格");break;
			default:System.out.print("差");break;
		} 
		System.out.println();
	}
	
	/**
	 * 3、用for、while、do..while分别计算1到100的和
	 */
	public static void sum1To100() {
		int sum1=0;
		int i=1;
		for(i=1;i<=100;i++) {
			sum1+=i;
		}
		System.out.println("1到100的和sum1="+sum1);
		
		//换成while
		int sum2=0;
		int j=1;
		while(j<=100) {
			sum2+=j;
			j++;
		}
		System.out.println("1到100的和sum2="+sum2);
		
		//换成do..while
		int sum3=0;
		int m=1;
		do {
			sum3+=m;
			m++;
		}while(m<=100);
		System.out.println("1到100的和sum3="+sum3);
	}
	
	/**
	 * 6、图形2、3
	 */
	public static void testTU() {
		System.out.println("第一个图：");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("第二个图：");
		for(int m=6;m>0;m--) {
			for(int n=2*m-1;n>0;n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 7、求1到100不能被3整除的整数之和。
	 */
	public static void testSumBut3() {
		int sum = 0;
//		System.out.print("1到100所有能被3整除的数为：");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
//				if(i<99) System.out.print(i+",");
//				if(i==99)System.out.print(i);
				sum+=i;
			}
		}
		System.out.println("\n1到100不能被3整除的整数之和为："+sum);
	}
}
