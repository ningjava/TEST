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
		//使用二分法查找指定的元素，如果找到则返回元素的位置索引，如果找不到，则返回一个负数。
		//在使用binarySearch（）之前需要对数组进行排序
		int index1 = Arrays.binarySearch(a, 5);
		int index2 = Arrays.binarySearch(a,11);
		System.out.println(index1);
		System.out.println(index2);
	}

}
