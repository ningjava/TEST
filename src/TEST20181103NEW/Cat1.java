package TEST20181103NEW;

//�̳У�������д
public class Cat1 extends Animal1 {
	private String eyesColor;

	public Cat1(String name, String color) {
		super(name);
		this.eyesColor = color;
	}
	
	public void Sounds() {
		System.out.println("è������");
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}

	/*
	 * public static void main(String[] args) { Cat1 cat1=new Cat1(); cat1.sounds();
	 * cat1.doRun(); }
	 */

	public String getDetail(String kidsName) {
		return kidsName+"�ĳ�����һֻ����"+super.getName()+"��è��"+"�۾�����ɫ��"+this.eyesColor;
	}
}
