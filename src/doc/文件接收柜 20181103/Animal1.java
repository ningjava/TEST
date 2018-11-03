//package test;

//继承：父类动物
public class Animal1 {
//	private boolean isAnimal = true;
//	int legs=4;
	private String name;

	public Animal1(String name) {
		this.name = name;
	}

	public void doRun() {
		System.out.println("会跑！");
	}

	public void doEat() {
		System.out.println("会吃！");
	}

	public void Sounds() {
		System.out.println("会叫！");
	}
}
