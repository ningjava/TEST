package TEST20181104;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(String name, String fillColor, String borderColoer, double width, double length) {
		super(name, fillColor, borderColoer);
		this.width = width;
		this.length = length;
	}

	/**
	 * ��д���෽���������
	 */
	public String getArea() {
		return super.getName() + "�����ɫΪ" + super.getFillColor() + ",�߿�ɫΪ" + super.getBorderColor() + ",���Ϊ"
				+ this.width * this.length;
	}
	
	public String getPerimeter() {
		return ",�ܳ�Ϊ"+ (width+length) * 2;
	}

	/**
	 * ��дObject�������toString()����
	 */
	public String toString() {
		return "���γ���"+this.length+","+this.width;
	}
}
