package JAVA20181111;

public class TestString {

	public static void main(String[] args) {
		String str1 = "HelloWorld";
		byte[] b = {48,49,50,51,52,53,54,55};
//		String str3 = new String(b,"GBK");
		String str4 = new String(b,1,3);
		String str5 = "Helloworld";
		String str6 = "HelloWorld";
		
		System.out.println(str4);
		System.out.println("-------part1------");
		System.out.println(str1.charAt(5));//charAt
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,9));
		System.out.println("--------part2-------");
		System.out.println(str1.indexOf("d"));
		System.out.println(str1.indexOf("z"));
		System.out.println(str1.lastIndexOf("l"));
		System.out.println(str1.length());
		System.out.println("--------part3-------");
		System.out.println(str1.startsWith("He"));
		System.out.println(str1.endsWith("d"));
		System.out.println("---------part4------");
		System.out.println(str1.equals(str5));
		System.out.println(str1.equals(str6));
		System.out.println(str1.endsWith(str5));
		System.out.println(str1.equalsIgnoreCase(str5));
		System.out.println("--------part5-------");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("---------part6------");
		char[] a = str1.toCharArray();
		System.out.println(a);
		for(int i=0;i<str1.length();i++) {
			System.out.println(a[i]);
		}
		System.out.println("------part7---------");
		System.out.println(str1.replace("l", "L"));
		System.out.println(str1.matches("[a-zA-Z]{10}"));
		
	}

}
