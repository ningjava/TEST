package TEST20181110;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		int[] a = {1,6,3,4,5,2,7,8,9};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
		System.out.println();
		//ʹ�ö��ַ�����ָ����Ԫ�أ�����ҵ��򷵻�Ԫ�ص�λ������������Ҳ������򷵻�һ��������
		//��ʹ��binarySearch����֮ǰ��Ҫ�������������
		int index1 = Arrays.binarySearch(a, 5);
		int index2 = Arrays.binarySearch(a,11);
		System.out.println(index1);
		System.out.println(index2);
	}

}
