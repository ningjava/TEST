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
		//��̬����i��ʵ���Ķ��󣬲��湹�캯���仯��jֻҪ��newһ�ξ����¸�ֵΪ20
		TestDemo d2 = new TestDemo();
		d2.add(100);
		System.out.println(d.i+"//"+d.j);
		System.out.println("��̬����i��ʵ���Ķ������౻ʵ������ʱ���Ѿ�ȷ��ֵ�����湹�캯���仯��jֻҪ��newһ�ξ����¸�ֵΪ20");
	}
}
