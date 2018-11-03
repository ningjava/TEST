package TEST20181103NEW;

//继承，子类重写
public class Cat1 extends Animal1 {
	private String eyesColor;

	public Cat1(String name, String color) {
		super(name);
		this.eyesColor = color;
	}
	
	public void Sounds() {
		System.out.println("猫喵喵叫");
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
		return kidsName+"的宠物是一只名叫"+super.getName()+"的猫，"+"眼睛的颜色是"+this.eyesColor;
	}
}
