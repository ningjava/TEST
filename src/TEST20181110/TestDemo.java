package TEST20181110;

public class TestDemo {

	public static int i=10;
	public int j;

	TestDemo(){
		this.j=20;
	}
	
	public void add(int N) {
		i+=N;
		j+=N;
	}
	public static void main(String[] args) {
		System.out.println(TestDemo.i);
		TestDemo d = new TestDemo();
		System.out.println(d.i+"//"+d.j);
		d.add(10);
		System.out.println(d.i+"//"+d.j);
		d.add(2);
		System.out.println(d.i+"//"+d.j);
		//静态变量i是实例的对象，不随构造函数变化，j只要被new一次就重新赋值为20
		TestDemo d2 = new TestDemo();
		d2.add(100);
		System.out.println(d.i+"//"+d.j);
		System.out.println("静态变量i是实例的对象，在类被实例化的时候已经确定值，不随构造函数变化，j只要被new一次就重新赋值为20");
	}
}
