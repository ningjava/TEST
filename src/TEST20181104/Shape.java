package TEST20181104;

public abstract class Shape {

	private String name;
	private String fillColor;
	private String borderColor;

	public Shape(String name, String fillColor, String borderColor) {
		this.name = name;
		this.fillColor = fillColor;
		this.borderColor = borderColor;
	}

	/**
	 * 由于不知道如何计算不确定的形状的面积，所以讲方法定义成一个抽象方法
	 * 
	 * @return
	 */
	public abstract String getArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

}
