package TEST20181104;

/**
 * 圆形
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private double radius;

	public Circle(String name, String fillColor, String borderColor, double radius) {
		super(name, fillColor, borderColor);
		this.radius = radius;
	}

	/**
	 * 重写父类的抽象方法计算面积
	 */
	public String getArea() {
		return super.getName() + "的填充色为" + super.getFillColor() + ",边框色为" + super.getBorderColor() + ",面积为"
				+ Math.PI * radius * radius;
	}

	public String getPerimeter() {
		return ",周长为"+ Math.PI * radius * 2;
	}
	
	/**
	 * 重写Object类里面的toString()方法
	 */
	public String toString() {
		return "圆形半径"+this.radius;
	}
	
	/**
	 * 重写Object类里面的equals()方法
	 */
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle c = (Circle)o;//向下转型
			if(c.radius==this.radius) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
