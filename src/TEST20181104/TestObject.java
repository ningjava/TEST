package TEST20181104;

import org.junit.Test;

public class TestObject {
	@Test
	public void test() {
		/*==��ϵ������Ƚ��������󣬱Ƚϵ����������ñ������õ��ǲ���ͬһ�������������Ϊtrue,����ʹ�������������һ�������Ҳ��false*/
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		System.out.println(s1==s2);
		String s3=s1;//��s3����Ҳ��s1,��ͬһ�����󣬲����´����Ĵ洢�ռ䣬������ͬ
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));//��equals�Ƚ��������������Ƿ����
		System.out.println(s1.equals(s3));//��equals�Ƚ��������������Ƿ����
		
		System.out.println("***********************");
		/**
		 * equalsҲ��Ƚ��Ƿ���ͬһ������ֻ������֮�����������ΪString����д��Object���equals������
		 * ���滻�ɷ�String���������Լ��ɿ���
		 * */
		Shape sp1 = new Circle("Circle1", "blue", "green", 2.2);
		Shape sp2 = new Circle("Circle1", "blue", "green", 2.2);
		System.out.println(sp1==sp2);
		System.out.println(sp1.equals(sp2));
		/**���Գ�����дCircle�е�equals�������ж�����Բ�Ƿ�������ж�Բ�뾶��ͬ��������,Ȼ���ٴ�ִ������
		 * ������Ͻ�����д����������Ҫ�ж����ơ����ɫ���߿�ɫ���뾶���������Զ���Ȳ������
		 * */
		
	}
}
