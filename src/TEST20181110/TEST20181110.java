package TEST20181110;

import java.util.Arrays;

/**
 * Arrays����Comparable�ӿ�
 * @author ����
 */
public class TEST20181110 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = Arrays.copyOf(a, a.length);
		b[3]=100;
		//ע��Arrays.copyOf��ֱ��b=a��һ����b=a�������������ͬһ������
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
