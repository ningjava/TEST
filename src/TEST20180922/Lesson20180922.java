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
		 * �Ĵ���ϰ
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
		 * �ĺ�
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
			 * 20180922 ������
			 */
			public static void zuoYongYu(){
			    int first=1;		//first������������￪ʼ
			    System.out.println("first="+first);
			    int second=2;	//second������������￪ʼ
			    System.out.println("first="+first);
			    System.out.println("second="+second);
			    int third=3;		//third������������￪ʼ
			    System.out.println("first="+first);
			    System.out.println("second="+second);
			    System.out.println("third="+third);
			    //3���������������������
			  }
			
			/**
			 * IF...ELSE
			 */
			public static void ifElseTest() {
				Scanner sc = new Scanner(System.in);
				int s = sc.nextInt();
				/*if(s >=90)
					System.out.println("��");
			    else  if(s >=80)    //û��Ҫдelse  if((s >=80)&&(s<90)) 
			    	 System.out.println("��");
			    else  if(s >=70)
			    	System.out.println("��");
			    else  if(s >=60)
			        System.out.println("����");
			    else
			        System.out.println("������");*/
				
				//��SWITCH...CASE ���� IF...ELSE
				int i =s/10;
				System.out.println("i="+i);
				//������治��break����һֱ������ִ��case
				switch(i){
					case 10:
					case 9:System.out.print("��");break;
					case 8:System.out.print("��");break;
					case 7:System.out.print("��");break;
					case 6:System.out.print("����");break;
					default:System.out.print("��");break;
				} 
				
			}
			
			/**
			 * ��for��while��do..while�ֱ����1��100�ĺ�
			 */
			public static void testFOR() {
				int sum1=0;
				int i=1;
				for(i=1;i<=100;i++) {
					sum1+=i;
				}
				System.out.println("sum1="+sum1);
				
				//����while
				int sum2=0;
				int j=1;
				while(j<=100) {
					sum2+=j;
					j++;
				}
				System.out.println("sum2="+sum2);
				
				//����do..while
				int sum3=0;
				int m=1;
				do {
					sum3+=m;
					m++;
				}while(m<=100);
				System.out.println("sum3="+sum3);
			}
			
			/**
			 * ����1^2+2^2+3^2+...+i^2...���������5000ʱֹͣ���㣬�������Ͷ�Ӧ��iֵ��
			 */
			public static void testPingFang() {
				//����do..while
				int sum=0;
				int m=1;
				for(m=1;;m++) {
					sum+=m*m;
					if(sum>5000) {System.out.println("sum="+sum+";m="+m);break;};
				}
			}
			
			/**
			 * �����ܹ������ֻ��ŵ�ǰ��λ�ж���Ӫ�̣����������ֻ���ǰ��λ��136��137��138��139����������ƶ����������130��131��133������������š��������186��188�����������ͨ�����������������ֻ��ţ��������δ֪��Ӫ�̡���
			 * 
			 */
			public static void testPhoneNo() {
				final String YD="136,137,138,139";
				final String DX="130,131,133";
				final String LT="186,188";
				Scanner sc = new Scanner(System.in);
				String phoneNo = sc.nextLine();
				if(phoneNo==null || phoneNo.length()<3)
					System.out.println("������3λ�����ֻ��š�");
				else {
					String first3 = phoneNo.substring(0, 3);
					System.out.println("��������ֻ���ǰ3λ��"+first3);
					if(YD.contains(first3)) {System.out.println("�ƶ�");return;}
					if(DX.contains(first3)) {System.out.println("����");return;}
					if(LT.contains(first3)) {System.out.println("��ͨ");return;}
					System.out.println("������Ӫ��");
				}
			}
			
			/**
			 * ��1��100���ܱ�3����������֮��
			 * %����
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
