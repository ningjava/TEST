package TEST20181020;

public class JUXING {

	private double len;//矩形长
	private double wid;//矩形宽
	private double x;//中心点坐标x
	private double y;//中心点坐标y
	
	public JUXING() {//无参构造方法
		
	}
	
	public JUXING(double len,double wid) {//含参构造方法
		this.len=len;
		this.wid=wid;
		this.x = len/2;
		this.y = wid/2;
	}
	
	public JUXING(JUXING j) {//含参构造方法
		this.len = j.len;
		this.wid = j.wid;
		this.x = j.x;
		this.y = j.y;
	}
	public double getLen() {
		return len;
	}
	public void setLen(double len) {
		this.len = len;
	}
	public double getWid() {
		return wid;
	}
	public void setWid(double wid) {
		this.wid = wid;
	}
	
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	/**
	 * 计算矩形面积
	 */
	public double countArea() {
		return this.len*this.wid;
	}

	/**
	 * 计算矩形周长 
	 * @return 
	 */
	public double countGirth() {
		return 2*(this.len+this.wid);
	}
}
