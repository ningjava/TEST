package TEST20181103NEW;

//������д
public class Dog1 extends Animal1 {
	private String furColor;

	public Dog1(String name, String color) {
		super(name);
		this.furColor = color;
	}

	public void doRun() {
		System.out.println("���������ȣ����ܣ�");
	}

	public void Sounds() {
		System.out.println("��������");
	}

	/*
	 * public static void main(String[] args) { Dog1 dog2 = new Dog1();
	 * dog2.doRun(); dog2.doEat(); dog2.sounds(); }
	 */
}
