package TEST20181020;

/**
 * 定义圆类Circle,有属性半径、属性圆周率，定义计算圆面积方法、圆周长方法。
 * @author zhaoNing
 */
public class Circle {

	private double radius;//半径
	private double pi=3.142;
	
	/**
	 * 计算圆面积
	 * @return
	 */
	double getArea() {
		return pi*radius*radius;
	}
	
	/**
	 * 计算圆周长
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
