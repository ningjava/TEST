package HomeWork20181104;
/**
 * 鱼
 * 20181004作业
 * @author 赵宁
 * @班级 继续本18
 * @学号 118992215
 *
 */
public class Fish extends Animal {

	public Fish(String name, int age) {
		super(name, age);
	}

	/**
	 * 重写父类方法
	 */
	public void run() {
		System.out.println(super.getName()+" was "+super.getAge()+" years old,it swims by Fins.");
	}
}
