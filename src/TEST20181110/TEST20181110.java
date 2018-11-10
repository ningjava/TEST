package TEST20181110;

import java.util.Arrays;

/**
 * Arrays类与Comparable接口
 * @author 赵宁
 */
public class TEST20181110 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = Arrays.copyOf(a, a.length);
		b[3]=100;
		//注意Arrays.copyOf与直接b=a不一样，b=a是另个变量引用同一个数组
		int[] c = Arrays.copyOf(a, 2);
		int[] d = Arrays.copyOf(a, 15);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+"");
		}
		System.out.println();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+"");
		}
		System.out.println();
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]+"");
		}
	}
}
