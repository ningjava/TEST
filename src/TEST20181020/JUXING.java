package TEST20181020;

public class JUXING {

	private double len;//���γ�
	private double wid;//���ο�
	private double x;//���ĵ�����x
	private double y;//���ĵ�����y
	
	public JUXING() {//�޲ι��췽��
		
	}
	
	public JUXING(double len,double wid) {//���ι��췽��
		this.len=len;
		this.wid=wid;
		this.x = len/2;
		this.y = wid/2;
	}
	
	public JUXING(JUXING j) {//���ι��췽��
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
	 * ����������
	 */
	public double countArea() {
		return this.len*this.wid;
	}

	/**
	 * ��������ܳ� 
	 * @return 
	 */
	public double countGirth() {
		return 2*(this.len+this.wid);
	}
}
