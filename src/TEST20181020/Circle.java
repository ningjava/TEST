package TEST20181020;

/**
 * ����Բ��Circle,�����԰뾶������Բ���ʣ��������Բ���������Բ�ܳ�������
 * @author zhaoNing
 */
public class Circle {

	private double radius;//�뾶
	private double pi=3.142;
	
	/**
	 * ����Բ���
	 * @return
	 */
	double getArea() {
		return pi*radius*radius;
	}
	
	/**
	 * ����Բ�ܳ�
	 * @return
	 */
	double getPerimeter() {
		return 2*pi*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	
	
}
