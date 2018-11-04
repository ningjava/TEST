package TEST20181104;

import org.junit.Test;

public class TestObject {
	@Test
	public void test() {
		/*==关系运算符比较两个对象，比较的是两个引用变量引用的是不是同一个对象，如果是则为true,否则即使两个对象的属性一样，结果也是false*/
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		System.out.println(s1==s2);
		String s3=s1;//此s3引的也是s1,是同一个对象，不是新创建的存储空间，所以相同
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));//用equals比较两个对象内容是否相等
		System.out.println(s1.equals(s3));//用equals比较两个对象内容是否相等
		
		System.out.println("***********************");
		/**
		 * equals也会比较是否是同一个对象，只是上面之所以相等是因为String类重写了Object类的equals方法。
		 * 下面换成非String对象来测试即可看出
		 * */
		Shape sp1 = new Circle("Circle1", "blue", "green", 2.2);
		Shape sp2 = new Circle("Circle1", "blue", "green", 2.2);
		System.out.println(sp1==sp2);
		System.out.println(sp1.equals(sp2));
		/**可以尝试重写Circle中的equals方法，判断两个圆是否相等是判断圆半径相同来决定的,然后再次执行试试
		 * 如果更严谨，重写方法中则需要判断名称、填充色、边框色、半径等所有属性都相等才是相等
		 * */
		
	}
}
