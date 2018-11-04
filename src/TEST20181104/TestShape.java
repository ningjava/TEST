package TEST20181104;

import org.junit.Test;

public class TestShape {
    @Test
	public void test() {
		//向上转型 最终s1,s2都是Shape对象，如果Shape中getArea方法删掉，则此处业务无法调用到。
		Shape s1 = new Circle("Circle1", "blue", "green", 2.2);
		Shape s2 = new Rectangle("Rectangle1", "red", "gray", 8, 9);

		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		
		System.out.println();
		//如果想调用到子类自身方法，就需要向下转型，讲父类的对象强转为子类对象后再调用子类方法
		
		Shape s[]=new Shape[2];//定义一个Shape对象数组
		//存入两个Shape对象，分别为Circle2，Rectangle2
		s[0]=new Circle("Circle2", "blue", "green", 2.2);
		s[1]=new Rectangle("Rectangle2", "red", "gray", 8,9);
		
		for(int i=0;i<s.length;i++) {
			String str = s[i].getArea();//此时得到的是Shape对象，所以能调用getArea（）方法
			/*intanceof是用来向下转型时判断某个对象是否是某个类的实例*/
			if(s[i] instanceof Circle) {
				//如果得到的是Circle对象，则调用子类Circle中的自身方法getPerimeter()
				Circle c = (Circle)s[i];
				System.out.println(str+c.getPerimeter());
				
			}else {
				Rectangle r = (Rectangle)s[i];
				System.out.println(str+r.getPerimeter());
			}
		}
		
	}
}
