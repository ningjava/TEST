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
	 * 一维数组
	 */
		public void array1() {
			int[] s ;        // 声明变量
			int i ;          // 声明变量
			s = new int[5] ;  //创建数组对象
			for(i = 0 ; i < 5 ; i++) {  
				s[i] = i ;  
			}  
			System.out.println (s.length) ;
			for(i = 4 ; i >= 0 ; i--) {  
				System.out.println ("" + s[i]) ;
			}  
		}

		/**
		 * 二维数组
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
		 * 一维数组越界
		 * @param args
		 */
		public void arrayIndexOutOfBoundsExceptionTest() {
			int[] x = { 1, 2, 3 };
			System.out.println(x[3]);//最多可到2，所此处会抛异常
			// java.lang.ArrayIndexOutOfBoundsException
		}
		
		/**
		 * 一维数组长度
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
			Arrays.sort(a);//升序排列
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.binarySearch(a, 100));
		}
		
		/**
		 * 课堂练习
		 * 1、创建一维数组，存放学生的6科成绩，计算总分和平均分。
		 */
		public void classTest1() {
			double[] x = { 99, 85, 66 ,88,75,98};//学生6科成绩
			double total = 0,evr = 0;
			for (int y = 0; y < x.length; y++) {
				total=total+(Double)(x[y]);
			} 
			evr = total/x.length;
			DecimalFormat dFormat = new DecimalFormat("#.00");
	        String yearString = dFormat.format(evr);
			System.out.println("总成绩="+total+";平均成绩="+Double.valueOf(yearString));
		}
		/**
		 * 2、请将”我” “爱” “北” “京”存入数组，然后正着和反着输出。
		 */
		public void classTest2() {
			String[] s = {"我","爱","北","京"};
			for (int y = 0; y < s.length; y++) {
				System.out.print(s[y]);
			} 
			System.out.println();
			for (int y = s.length-1; y >=0; y--) {
				System.out.print(s[y]);
			} 
		}
		/**
		 *3、 要求输入一组英文字符串数组，让这个字符串数组中前面一个元素的最后一个字母和下一个元素的首位上的字母相等，并且每个元素的长度大于等于2且小于等于100。
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
					System.out.println("找到的单词总数："+n);
				}
		
		/**
		 *4、输入10个数，将不重复的数放入数组，输出数组元素。
		 *
		 */
}
