package TEST20180922;

import java.util.Scanner;
/**
 * @title 20180922�κ���ҵ
 * @author ����
 * @�༶  ������18
 * @ѧ�� 118992215
 */
public class ZUOYE20180922 {

	public static void main(String[] args) {
		//1������1^2+2^2+3^2+...+i^2...���������5000ʱֹͣ���㣬�������Ͷ�Ӧ��iֵ��
		ZUOYE20180922.testPingFang();
		//2������³˷���
		ZUOYE20180922.testCFB();
		//3������a��b֮�����е������ͺ�ż���Ͳ������a��bȡֵ�Զ���ֵ�����50����
		ZUOYE20180922.testJOSHU();
		//4�������ܹ������ֻ��ŵ�ǰ��λ�ж���Ӫ�̣����������ֻ���ǰ��λ��136��137��138��139����������ƶ����������130��131��133������������š��������186��188�����������ͨ�����������������ֻ��ţ��������δ֪��Ӫ�̡�����if��switch��
		ZUOYE20180922.testPhoneNo();
		//5����д����ʵ�ֶԸ�����4�������Ӵ�С��˳������
		ZUOYE20180922.testOrder();
	}
	
	//1������1^2+2^2+3^2+...+i^2...���������5000ʱֹͣ���㣬�������Ͷ�Ӧ��iֵ��
	public static void testPingFang() {
		//����do..while
		int sum=0;
		int m=1;
		for(m=1;;m++) {
			sum+=m*m;
			if(sum>5000) {System.out.println("��ҵ1��ƽ����sum="+sum+";m="+m);break;};
		}
	}

	/*2��������³˷���
	 1��1= 1
	 2��1= 2 2��2= 4
	 3��1= 3 3��2= 6 3��3= 9
	 4��1= 4 4��2= 8 4��3=12 4��4=16
	 5��1= 5 5��2=10 5��3=15 5��4=20 5��5=25
	 6��1= 6 6��2=12 6��3=18 6��4=24 6��5=30 6��6=36
	 7��1= 7 7��2=14 7��3=21 7��4=28 7��5=35 7��6=42 7��7=49
	 8��1= 8 8��2=16 8��3=24 8��4=32 8��5=40 8��6=48 8��7=56 8��8=64
	 9��1= 9 9��2=18 9��3=27 9��4=36 9��5=45 9��6=54 9��7=63 9��8=72 9��9=81*/
	public static void testCFB() {
		System.out.println("��ҵ2���˷���");
		for(int i = 1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"x"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}
	
	//3������a��b֮�����е������ͺ�ż���Ͳ������a��bȡֵ�Զ���ֵ�����50����
	public static void testJOSHU() {
		int a = 666,b = 888,sumJ = 0,sumO=0;
		for(int i = a;i<=b;i++) {
			if(i%2==0)sumO+=i;
			if(i%3==0)sumJ+=i;
		}
		System.out.println("��ҵ����a="+a+",b="+b+";ab֮��������="+sumJ+";ab֮��ż����="+sumO);
	}
	//4�������ܹ������ֻ��ŵ�ǰ��λ�ж���Ӫ�̣����������ֻ���ǰ��λ��136��137��138��139����������ƶ����������130��131��133������������š��������186��188�����������ͨ�����������������ֻ��ţ��������δ֪��Ӫ�̡�����if��switch��
	public static void testPhoneNo() {
		final String YD="136,137,138,139";
		final String DX="130,131,133";
		final String LT="186,188";
		Scanner sc = new Scanner(System.in);
		System.out.println("��ҵ4��������3λ�����ֻ��ţ�");
		String phoneNo = sc.nextLine();
		if(phoneNo==null || phoneNo.length()<3)
			System.out.println("�������������3λ�����ֻ��ţ�");
		else {
			String first3 = phoneNo.substring(0, 3);
			System.out.println("��������ֻ���ǰ3λ��"+first3);
			if(YD.contains(first3)) {System.out.println("�ƶ�");return;}
			if(DX.contains(first3)) {System.out.println("����");return;}
			if(LT.contains(first3)) {System.out.println("��ͨ");return;}
			System.out.println("������Ӫ��");
		}
	}
	//5����д����ʵ�ֶԸ�����4�������Ӵ�С��˳������
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
		System.out.println("��ҵ5���Ӵ�С��˳�������Ϊ��");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
