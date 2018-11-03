package TEST20180922;

import java.util.Scanner;

public class Lesson20180922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lesson20180922.Demo();
//		Lesson20180922.jisuan();
//		Lesson20180922.zuoYongYu();
//		Lesson20180922.ifElseTest();
//		Lesson20180922.testFOR();
//		Lesson20180922.testPingFang();
//		Lesson20180922.testPhoneNo();
		Lesson20180922.testNot3();
	}
	//------------------20180922---------------------------

		/**
		 * 改错练习
		 * public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i = 1 , j;
			float f1 = 0.1 ; float f2 = 123;
			long l1 = 12345678, l2 = 8888888888;
			double d1 = 2e20, d2 = 124;
			byte b1 = 1, b2 = 2, b3 = 129;
			j = j + 10;
			i = i / 10;
			char c1 = 'a', c2 = 125;
			byte b = b1 - b2;
			char c = c1 + c2 - 1;
			float f3 = f1 + f2;
			float f4 = f1 + f2 * 0.1;
			double d = d1 * i + j;
			float f = (float)(d1*5+d2);
		}
		 */
		/**
		 * 改后
		 */
			public static  void Demo() {
				// TODO Auto-generated method stub
				int i = 1 , j = 0;
				float f1 = 0.1f ; float f2 = 123;
				long l1 = 12345678, l2 = 88888;
				double d1 = 2e20, d2 = 124;
				byte b1 = 1, b2 = 2, b3 = 127;
				j = j + 10;
				i = i / 10;
				char c1 = 'a', c2 = 125;
				byte b = (byte) (b1 - b2);
				char c = (char) (c1 + c2 - 1);
				float f3 = f1 + f2;
				float f4 = (float) (f1 + f2 * 0.1);
				double d = d1 * i + j;
				float f = (float)(d1*5+d2);
			}


			/**
			 * 20180922
			 */
			public static void jisuan() {
				// TODO Auto-generated method stub
				int a = 10;
				int b = 20;

				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("b / a = " + (b / a));
				System.out.println("b % a = " + (b % a));
				int c = 20;
				System.out.println("--c = " + (--c));//19
				int d = 20;
				System.out.println("d-- = " + (d--));//20
				int e=20;
				System.out.println("e++ = " + (e++));//20
				int f=20;
				System.out.println("++f = " + (++f));//21
			}
			
			/**
			 * 20180922 作用域
			 */
			public static void zuoYongYu(){
			    int first=1;		//first的作用域从这里开始
			    System.out.println("first="+first);
			    int second=2;	//second的作用域从这里开始
			    System.out.println("first="+first);
			    System.out.println("second="+second);
			    int third=3;		//third的作用域从这里开始
			    System.out.println("first="+first);
			    System.out.println("second="+second);
			    System.out.println("third="+third);
			    //3个变量的作用域到这里结束
			  }
			
			/**
			 * IF...ELSE
			 */
			public static void ifElseTest() {
				Scanner sc = new Scanner(System.in);
				int s = sc.nextInt();
				/*if(s >=90)
					System.out.println("优");
			    else  if(s >=80)    //没必要写else  if((s >=80)&&(s<90)) 
			    	 System.out.println("良");
			    else  if(s >=70)
			    	System.out.println("中");
			    else  if(s >=60)
			        System.out.println("及格");
			    else
			        System.out.println("不及格");*/
				
				//用SWITCH...CASE 代替 IF...ELSE
				int i =s/10;
				System.out.println("i="+i);
				//如果下面不加break，会一直往后面执行case
				switch(i){
					case 10:
					case 9:System.out.print("优");break;
					case 8:System.out.print("好");break;
					case 7:System.out.print("良");break;
					case 6:System.out.print("及格");break;
					default:System.out.print("差");break;
				} 
				
			}
			
			/**
			 * 用for、while、do..while分别计算1到100的和
			 */
			public static void testFOR() {
				int sum1=0;
				int i=1;
				for(i=1;i<=100;i++) {
					sum1+=i;
				}
				System.out.println("sum1="+sum1);
				
				//换成while
				int sum2=0;
				int j=1;
				while(j<=100) {
					sum2+=j;
					j++;
				}
				System.out.println("sum2="+sum2);
				
				//换成do..while
				int sum3=0;
				int m=1;
				do {
					sum3+=m;
					m++;
				}while(m<=100);
				System.out.println("sum3="+sum3);
			}
			
			/**
			 * 计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
			 */
			public static void testPingFang() {
				//换成do..while
				int sum=0;
				int m=1;
				for(m=1;;m++) {
					sum+=m*m;
					if(sum>5000) {System.out.println("sum="+sum+";m="+m);break;};
				}
			}
			
			/**
			 * 假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，则输出“移动”、如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。如果输入的其他手机号，则输出“未知运营商”。
			 * 
			 */
			public static void testPhoneNo() {
				final String YD="136,137,138,139";
				final String DX="130,131,133";
				final String LT="186,188";
				Scanner sc = new Scanner(System.in);
				String phoneNo = sc.nextLine();
				if(phoneNo==null || phoneNo.length()<3)
					System.out.println("请输入3位以上手机号。");
				else {
					String first3 = phoneNo.substring(0, 3);
					System.out.println("您输入的手机号前3位是"+first3);
					if(YD.contains(first3)) {System.out.println("移动");return;}
					if(DX.contains(first3)) {System.out.println("电信");return;}
					if(LT.contains(first3)) {System.out.println("联通");return;}
					System.out.println("其他运营商");
				}
			}
			
			/**
			 * 求1到100不能被3整除的整数之和
			 * %求余
			 */
			public static void testNot3() {
				int a = 0;
				for(int i=1;i<=100;i++) {
					if(i%3!=0) {
						a=a+i;
					}
				}
				System.out.println(a);
			}
			
			
}
