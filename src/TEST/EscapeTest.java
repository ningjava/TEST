package TEST;

/**
 * @author Administrator
 * @time 创建时间：2018年2月10日 下午1:27:57
 * 
 */
public class EscapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 用.做分隔符
		System.out.println("用.做分隔符");
		String[] str1 = "a.b".split("\\.");
		for (int i = 0; i < str1.length; i++) {
			System.out.println("str[" + i + "]=" + str1[i]);
		}
		// 用|做分隔符
		System.out.println("用|做分隔符");
		String[] str2 = "aa|bb".split("\\|");
		for (int i = 0; i < str2.length; i++) {
			System.out.println("str[" + i + "]=" + str2[i]);
		}
		// 用*做分隔符
		System.out.println("用*做分隔符");
		String[] str3 = "aaa*bbb*ccc".split("\\*");
		for (int i = 0; i < str3.length; i++) {
			System.out.println("str3[" + i + "]=" + str3[i]);
		}
		// 用\做分隔符
		// "aaa\bbb\ccc" 的分隔方法
		// "aaa\bbb\ccc" 的正确表示方法是"aaaa\\bbbb\\cccc"
		System.out.println("用\\做分隔符");
		String[] str4 = "aaaa\\bbbb\\cccc".split("\\\\");
		for (int i = 0; i < str4.length; i++) {
			System.out.println("str4[" + i + "]=" + str4[i]);
		}
		// 多个分隔符
		System.out.println("多个分隔符");
		String[] str5 = "acount=? and uu =? or n=?".split("and|or");
		for (int i = 0; i < str5.length; i++) {
			System.out.println("str5[" + i + "]=" + str5[i]);
		}
	}

}
