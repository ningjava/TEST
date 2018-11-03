package TEST;

/**
 * @author Administrator
 * @time 创建时间：2018年2月10日 上午9:42:28
 * 
 */
public class UnicodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "网址：www.edu.cn";
		System.out.println("decodeUnicode:" + decodeUnicode(unicode(str)));
		}

	private static String decodeUnicode(String unicode) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		String[] hex = unicode.split("\\\\u");

		for (int i = 1; i < hex.length; i++) {
			int data = Integer.parseInt(hex[i], 16);
			sb.append((char) data);
		}
		return sb.toString();
	}

	public static String unicode(String source) {
		StringBuffer sb = new StringBuffer();
		char[] source_char = source.toCharArray();
		String unicode = null;
		for (int i = 0; i < source_char.length; i++) {

			unicode = Integer.toHexString(source_char[i]);

			if (unicode.length() <= 2) {
				unicode = "00" + unicode;
			}
			sb.append("\\u" + unicode);
		}
		System.out.println(sb);
		return sb.toString();
		
	
	}

}
