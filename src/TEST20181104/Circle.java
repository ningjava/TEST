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
}
