package JAVA20181111;

public class TestString {

	public static void main(String[] args) {
		String str = "HelloWorld";
		byte[] b = {48,49,50,51,52,53,54,55};
		String str2 = new String(b);
//		String str3 = new String(b,"GBK");
		String str4 = new String(b,1,3);
		String str4 = new String(b,1,3);
		System.out.println(str4);
	}

}
