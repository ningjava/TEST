package HomeWork20181104;

/**
 * 动物 
 * 20181004作业
 * @author 赵宁
 * @班级 继续本18
 * @学号 118992215
 *
 */
public abstract class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 抽象方法
	 */
	public abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
