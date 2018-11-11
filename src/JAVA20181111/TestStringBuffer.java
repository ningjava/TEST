package JAVA20181111;

public class TestStringBuffer {

	public static void main(String[] args) {
		System.out.println("-------part1------");
		//初始化出的StringBuffer对象是一个空的对象。
		StringBuffer s = new StringBuffer(); 
		System.out.println(s);
		//初始化出的StringBuffer对象的内容就是字符串"abc"。
		StringBuffer s2 = new StringBuffer("abc"); 
		System.out.println(s2);
//		StringBuffer对象和String对象之间的互转的代码如下：
		String s3 = "abc";
		//String转换为StringBuffer
		StringBuffer ssb = new StringBuffer(s3);
		System.out.println(ssb);
		StringBuffer sb = new StringBuffer("123");
		//StringBuffer转换为String
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
		sb.insert(4,false); //对象sb的值是"TestfalseString"
		System.out.println(sb);
		System.out.println("-------part5------");
		char[] b = {65,66,67,68,69,70,71,72,73};
		sb = new StringBuffer("1234567890");
		sb.insert(3, b,2,4);//数组B的索引2开始截取4个后，插入sb的索引3前面位置
		System.out.println(sb);      //123CDEF4567890
		System.out.println("-------part6------");
		sb = new StringBuffer("Test");
		 sb. deleteCharAt(1);  //对象sb的值变为”Tst”，删掉索引1位置字符
		 System.out.println(sb);
		 System.out.println("-------part7------");
		 sb = new StringBuffer("TestString");
		 sb. delete (1,4);  //对象sb的值是”TString,注意：包含start，不包含end，删掉索引1至所以4（含1不含4）
		 System.out.println(sb); 
		 System.out.println("-------part8------");
		 sb = new StringBuffer("abc");
		 sb.reverse();  //经过反转以后，sb中的内容将变为”cba”
		 System.out.println(sb); 
		 System.out.println("-------part9------");
		 sb = new StringBuffer("abc");
		 sb.setCharAt(1,'D');  // 则对象sb的值将变成”aDc” ，直接将某索引位置字符替换为给定值
		 System.out.println(sb); 
		 System.out.println("-------part10------");

	}

}
