package JAVA20181111;

import java.util.Calendar;

public class TestCanlender {
	public static void main(String[] args) {
		System.out.println("--------part1--------");
		Calendar c = Calendar.getInstance(); 
//		c.get(set(2018-1900,11-1,11); //2018.8.28
		System.out.println(c.get(Calendar.YEAR));//---��ݣ�
		System.out.println(c.get(Calendar.MONTH));//---�·ݣ� 
		System.out.println(c.get(Calendar.DATE));//---����; 
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//---���ڣ�
		System.out.println(c.get(Calendar.HOUR));//---12Сʱ�Ƶ�Сʱ����
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//---24Сʱ�Ƶ�Сʱ����
		System.out.println(c.get(Calendar.MINUTE));//---���ӣ�
		System.out.println(c.get(Calendar.SECOND));// ---�룻
		System.out.println(Calendar.DAY_OF_WEEK);//---����
	
		System.out.println("--------part2--------");
		
		Calendar c3 = Calendar.getInstance();
		c3.add(Calendar.DATE,100);
		int year = c3.get(Calendar.YEAR);
		int month = c3.get(Calendar.MONTH)+1;
		int date = c3.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");

		System.out.println("--------part3--------");
		Calendar c4 = Calendar.getInstance(); 
		c4.set(2018,8-1,28);
		Calendar c5 = Calendar.getInstance();
		c5.set(2018,10-1,1);
		boolean b = c5.after(c4);
		System.out.println(b);
		
		
		System.out.println("--------part4--------");
		Calendar c6 = Calendar.getInstance();
		long t =1252785271098L;
		System.out.println(t);
		//��Calendar����ת��Ϊ���ʱ��
		long t1 = c6.getTimeInMillis();
		System.out.println(t1);
		//�����ʱ��ת����Calendar����
		Calendar c9 = Calendar.getInstance();
		Calendar c10 =Calendar.getInstance();
		c10.setTimeInMillis(t);
		System.out.println(c10);
		c9.setTimeInMillis(t1);
		System.out.println(c9);
		System.out.println(c9.get(Calendar.YEAR));//---��ݣ�
		System.out.println(c9.get(Calendar.MONTH));//---�·ݣ� 
		System.out.println(c9.get(Calendar.DATE));//---����; 

		
		System.out.println("--------part5--------");
		long betweenDays = c9.getTime().getTime()-c10.getTime().getTime();
		System.out.println(betweenDays/(1000*60*60*24));
		
		System.out.println("--------�����������--------");
		Calendar c11 =Calendar.getInstance();
		final int start = 5;
		int days = 30;
		System.out.println("������         ����һ         ���ڶ�        ������        ������        ������        ������");
		for(int i=1;i<start;i++) {
			
		}
		for(int i=1;i<=days;i++) {
			if(i<start) {
				System.out.print("       ");
			}else {
				for(int j=1;j<=days;j++) {
					System.out.print(j);
					if((j+start-1)%7==0) {
						System.out.println();
					}
				}
			}
		}
	}
}
