package TEST20181104;

import org.junit.Test;

public class TestShape {
    @Test
	public void test() {
		//����ת�� ����s1,s2����Shape�������Shape��getArea����ɾ������˴�ҵ���޷����õ���
		Shape s1 = new Circle("Circle1", "blue", "green", 2.2);
		Shape s2 = new Rectangle("Rectangle1", "red", "gray", 8, 9);

		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		
		System.out.println();
		//�������õ�����������������Ҫ����ת�ͣ�������Ķ���ǿתΪ���������ٵ������෽��
		
		Shape s[]=new Shape[2];//����һ��Shape��������
		//��������Shape���󣬷ֱ�ΪCircle2��Rectangle2
		s[0]=new Circle("Circle2", "blue", "green", 2.2);
		s[1]=new Rectangle("Rectangle2", "red", "gray", 8,9);
		
		for(int i=0;i<s.length;i++) {
			String str = s[i].getArea();//��ʱ�õ�����Shape���������ܵ���getArea��������
			/*intanceof����������ת��ʱ�ж�ĳ�������Ƿ���ĳ�����ʵ��*/
			if(s[i] instanceof Circle) {
				//����õ�����Circle�������������Circle�е�������getPerimeter()
				Circle c = (Circle)s[i];
				System.out.println(str+c.getPerimeter());
				
			}else {
				Rectangle r = (Rectangle)s[i];
				System.out.println(str+r.getPerimeter());
			}
		}
		
	}
}
