package TEST20181013;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TEATARRAY {

	public static void main(String[] args) {
		TEATARRAY array = new TEATARRAY();
//		array.array1();
//		array.array2();
//		array.arrayIndexOutOfBoundsExceptionTest();
//		array.arrayLengthTest();
//		array.ArraysTest();
//		array.classTest1();
//		array.classTest2();
		array.classTest3();
	}

	/**
	 * һά����
	 */
		public void array1() {
			int[] s ;        // ��������
			int i ;          // ��������
			s = new int[5] ;  //�����������
			for(i = 0 ; i < 5 ; i++) {  
				s[i] = i ;  
			}  
			System.out.println (s.length) ;
			for(i = 4 ; i >= 0 ; i--) {  
				System.out.println ("" + s[i]) ;
			}  
		}

		/**
		 * ��ά����
		 */
		public void array2() {
			int a = 0;
			int[][] x = new int[2][3];
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					x[i][j] = a++;
					System.out.println(i+","+j);
					System.out.println(x[i][j]);
				}
			}
		}
		
		/**
		 * һά����Խ��
		 * @param args
		 */
		public void arrayIndexOutOfBoundsExceptionTest() {
			int[] x = { 1, 2, 3 };
			System.out.println(x[3]);//���ɵ�2�����˴������쳣
			// java.lang.ArrayIndexOutOfBoundsException
		}
		
		/**
		 * һά���鳤��
		 */
		public static void arrayLengthTest () {
			int[] x = { 1, 2, 3 };
			for (int y = 0; y < x.length; y++) {
				System.out.println(x[y]);
			} 
		}
		
		/**
		 * 
		 */
		public void ArraysTest() {
			int[] a = new int[] { 2, 84, 63, 18, 94, 25 };
			System.out.println(Arrays.toString(a));
			Arrays.sort(a);//��������
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.binarySearch(a, 100));
		}
		
		/**
		 * ������ϰ
		 * 1������һά���飬���ѧ����6�Ƴɼ��������ֺܷ�ƽ���֡�
		 */
		public void classTest1() {
			double[] x = { 99, 85, 66 ,88,75,98};//ѧ��6�Ƴɼ�
			double total = 0,evr = 0;
			for (int y = 0; y < x.length; y++) {
				total=total+(Double)(x[y]);
			} 
			evr = total/x.length;
			DecimalFormat dFormat = new DecimalFormat("#.00");
	        String yearString = dFormat.format(evr);
			System.out.println("�ܳɼ�="+total+";ƽ���ɼ�="+Double.valueOf(yearString));
		}
		/**
		 * 2���뽫���ҡ� ������ ������ �������������飬Ȼ�����źͷ��������
		 */
		public void classTest2() {
			String[] s = {"��","��","��","��"};
			for (int y = 0; y < s.length; y++) {
				System.out.print(s[y]);
			} 
			System.out.println();
			for (int y = s.length-1; y >=0; y--) {
				System.out.print(s[y]);
			} 
		}
		/**
		 *3�� Ҫ������һ��Ӣ���ַ������飬������ַ���������ǰ��һ��Ԫ�ص����һ����ĸ����һ��Ԫ�ص���λ�ϵ���ĸ��ȣ�����ÿ��Ԫ�صĳ��ȴ��ڵ���2��С�ڵ���100��
		 */
		public void classTest3() {
			String[] word = { "air", "all", "also", "AM", "an", "and", "anne",
					"anti", "any", "are", "as", "at", "away", "back", "BBC", "be",
					"been", "bond", "bone", "both", "but", "by", "cab", "came",
					"can", "come", "cut", "day", "deal", "deck", "deed", "did",
					"die", "do", "does", "dog", "down", "feed", "fog", "gone",
					"good", "home", "hood", "kind", "lime", "line", "moon", "noon",
					"pest", "rest" };
					String[] num = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
					"wxyz" };
					String input = "222";
					String[] in = input.split("");
					String matches = "";
					int n = 0;
					for (int i = 1; i < in.length; i++) {
					n = Integer.valueOf(in[i]);
					matches += "[" + num[n - 2] + "]";
					}n=0;
					System.out.println("matches = "+matches);
					for (String s : word) {
					if (s.toLowerCase().matches(matches)) {
					System.out.println(s);n++;
					}
					}
					System.out.println("�ҵ��ĵ���������"+n);
				}
		
		/**
		 *4������10�����������ظ������������飬�������Ԫ�ء�
		 *
		 */
}
