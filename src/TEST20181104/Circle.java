package TEST20181104;

/**
 * Բ��
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
	 * ��д����ĳ��󷽷��������
	 */
	public String getArea() {
		return super.getName() + "�����ɫΪ" + super.getFillColor() + ",�߿�ɫΪ" + super.getBorderColor() + ",���Ϊ"
				+ Math.PI * radius * radius;
	}

	public String getPerimeter() {
		return ",�ܳ�Ϊ"+ Math.PI * radius * 2;
	}
	
	/**
	 * ��дObject�������toString()����
	 */
	public String toString() {
		return "Բ�ΰ뾶"+this.radius;
	}
	
	/**
	 * ��дObject�������equals()����
	 */
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle c = (Circle)o;//����ת��
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
