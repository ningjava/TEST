package JAVA20181111;

public class TestStringBuffer {

	public static void main(String[] args) {
		System.out.println("-------part1------");
		//��ʼ������StringBuffer������һ���յĶ���
		StringBuffer s = new StringBuffer(); 
		System.out.println(s);
		//��ʼ������StringBuffer��������ݾ����ַ���"abc"��
		StringBuffer s2 = new StringBuffer("abc"); 
		System.out.println(s2);
//		StringBuffer�����String����֮��Ļ�ת�Ĵ������£�
		String s3 = "abc";
		//Stringת��ΪStringBuffer
		StringBuffer ssb = new StringBuffer(s3);
		System.out.println(ssb);
		StringBuffer sb = new StringBuffer("123");
		//StringBufferת��ΪString
		String sb2 = sb.toString();
		System.out.println(sb2);
		System.out.println("-------part2------");
		sb = new StringBuffer("abc");
		sb.append(true);  
		System.out.println(sb);
		System.out.println("-------part3------");
		
		
		sb = new StringBuffer();
		String user = "test";
		String pwd = "123";
		sb.append("select * from userInfo where username='")
		.append(user)
		.append("' and pwd='")
		.append(pwd)
		.append("'");
		System.out.println(sb);
		System.out.println("-------part4------");
		sb = new StringBuffer("TestString");
		sb.insert(4,false); //����sb��ֵ��"TestfalseString"
		System.out.println(sb);
		System.out.println("-------part5------");
		char[] b = {65,66,67,68,69,70,71,72,73};
		sb = new StringBuffer("1234567890");
		sb.insert(3, b,2,4);//����B������2��ʼ��ȡ4���󣬲���sb������3ǰ��λ��
		System.out.println(sb);      //123CDEF4567890
		System.out.println("-------part6------");
		sb = new StringBuffer("Test");
		 sb. deleteCharAt(1);  //����sb��ֵ��Ϊ��Tst����ɾ������1λ���ַ�
		 System.out.println(sb);
		 System.out.println("-------part7------");
		 sb = new StringBuffer("TestString");
		 sb. delete (1,4);  //����sb��ֵ�ǡ�TString,ע�⣺����start��������end��ɾ������1������4����1����4��
		 System.out.println(sb); 
		 System.out.println("-------part8------");
		 sb = new StringBuffer("abc");
		 sb.reverse();  //������ת�Ժ�sb�е����ݽ���Ϊ��cba��
		 System.out.println(sb); 
		 System.out.println("-------part9------");
		 sb = new StringBuffer("abc");
		 sb.setCharAt(1,'D');  // �����sb��ֵ����ɡ�aDc�� ��ֱ�ӽ�ĳ����λ���ַ��滻Ϊ����ֵ
		 System.out.println(sb); 
		 System.out.println("-------part10------");

	}

}
