package TEST20181104;

/**
 * 矩形
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
	 * 重写父类方法计算面积
	 */
	public String getArea() {
		return super.getName() + "的填充色为" + super.getFillColor() + ",边框色为" + super.getBorderColor() + ",面积为"
				+ this.width * this.length;
	}
	
	public String getPerimeter() {
		return ",周长为"+ (width+length) * 2;
	}

	/**
	 * 重写Object类里面的toString()方法
	 */
	public String toString() {
		return "矩形长宽"+this.length+","+this.width;
	}
}
