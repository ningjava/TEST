package TEST20180922;

import java.util.Scanner;

/**
 * @title 20180922������ҵ
 * @author ���� 
 * @�༶  ������18
 * @ѧ�� 118992215
 *
 */
public class LS20180922ZUOYE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2�����벻ͬ��ֵ���жϲ�����óɼ��������в�ȼ���
		LS20180922ZUOYE.testIfElse();
		LS20180922ZUOYE.testSwitch();
		//3����for��while��do..while�ֱ����1��100�ĺ�
		LS20180922ZUOYE.sum1To100();
		//6��ͼ��1��2
		LS20180922ZUOYE.testTU();
		//7����1��100���ܱ�3����������֮�͡�
		LS20180922ZUOYE.testSumBut3();
	}
	/**
	 * 2�����벻ͬ��ֵ���жϲ�����óɼ��������в�ȼ���
	 */
	//IF ELSE ��ʽ
	public static void testIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�1��");
		int s = sc.nextInt();
		if(s >=90)
			System.out.println("��");
	    else  if(s >=80)
	    	 System.out.println("��");
	    else  if(s >=70)
	    	System.out.println("��");
	    else  if(s >=60)
	        System.out.println("����");
	    else
	        System.out.println("��");
		System.out.println();
	}
	
	//SWITCH CASE ��ʽ
	public static void testSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�2��");
		int s = sc.nextInt();
		int i =s/10;
//		System.out.println("i="+i);
		//������治��break����һֱ������ִ��case
		switch(i){
			case 10:
			case 9:System.out.print("��");break;
			case 8:System.out.print("��");break;
			case 7:System.out.print("��");break;
			case 6:System.out.print("����");break;
			default:System.out.print("��");break;
		} 
		System.out.println();
	}
	
	/**
	 * 3����for��while��do..while�ֱ����1��100�ĺ�
	 */
	public static void sum1To100() {
		int sum1=0;
		int i=1;
		for(i=1;i<=100;i++) {
			sum1+=i;
		}
		System.out.println("1��100�ĺ�sum1="+sum1);
		
		//����while
		int sum2=0;
		int j=1;
		while(j<=100) {
			sum2+=j;
			j++;
		}
		System.out.println("1��100�ĺ�sum2="+sum2);
		
		//����do..while
		int sum3=0;
		int m=1;
		do {
			sum3+=m;
			m++;
		}while(m<=100);
		System.out.println("1��100�ĺ�sum3="+sum3);
	}
	
	/**
	 * 6��ͼ��2��3
	 */
	public static void testTU() {
		System.out.println("��һ��ͼ��");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("�ڶ���ͼ��");
		for(int m=6;m>0;m--) {
			for(int n=2*m-1;n>0;n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 7����1��100���ܱ�3����������֮�͡�
	 */
	public static void testSumBut3() {
		int sum = 0;
//		System.out.print("1��100�����ܱ�3��������Ϊ��");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
//				if(i<99) System.out.print(i+",");
//				if(i==99)System.out.print(i);
				sum+=i;
			}
		}
		System.out.println("\n1��100���ܱ�3����������֮��Ϊ��"+sum);
	}
}
