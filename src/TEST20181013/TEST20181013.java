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
		// ����test()ʱû�д�����������ϵͳ��������û�в�����test()������
//		t.test();
		// ����test()ʱ������һ���ַ���������
		// ���ϵͳ���������һ���ַ���������test()������
//		t.test("hello");
		
		//ʹ�÷������ط�ʽʵ�ּ�������ܳ���Բ�ܳ��ķ�����
		t.testYZCandJXZC(10,6);
		t.testYZCandJXZC(10);
	}

	/**
	 * ������ҵ����д���򣬴Ӽ�������һ�� 0~99999 ֮������������ж���������Ǽ�λ����
	 */
	public void test99999(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ��������ȷ��0~99999 ֮���������:");
		String inputA = sc.nextLine();
		Pattern pattern=Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d)*)?$"); 
		try {
			boolean b =  pattern.matcher(inputA).matches(); 
			if(!b) {
				System.out.println(" �������ݸ�ʽ������������ȷ��0~99999 ֮���������!");
				this.test99999();
			}else{
				double dd = Double.parseDouble(inputA);
				if(dd<0||dd>99999) {
					System.out.println(" ���ݷ�Χ������������ȷ��0~99999 ֮���������!");
					this.test99999();
				}else {
					System.out.println(inputA.length());
				}
			}
		}catch(Exception e) {
			System.out.println(" �������ݸ�ʽ������������ȷ��0~99999 ֮���������!");
			this.test99999();
		}
	}
	/**
	 * ����Overload
	 * @author Administrator
	 *
	 */
	// ���涨��������test()���������������β��б�ͬ
	// ϵͳ�����������������������ֱ���Ϊ��������
	public void test()
	{
		System.out.println("�޲���");
	}
	public void test(String msg)
	{
		System.out.println("���ص�test���� " + msg);
	}
	
	/**
	 * ������ϰ��ʹ�÷������ط�ʽʵ�ּ�������ܳ���Բ�ܳ��ķ�����
	 */
	public void testYZCandJXZC(double l,double w) {
		 DecimalFormat dFormat = new DecimalFormat("#.00");
         String yearString = dFormat.format(2*(l+w));
         System.out.println("����"+l+";��"+w+";�ܳ�="+Double.valueOf(yearString));
	}
	public void testYZCandJXZC(double r) {
		DecimalFormat dFormat = new DecimalFormat("#.00");
        String yearString = dFormat.format(2*Math.PI*r);
		System.out.println("Բ�뾶��"+r+";Բ�ܳ�="+Double.valueOf(yearString));
	}
	
	
}
