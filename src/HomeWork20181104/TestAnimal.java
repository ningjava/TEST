package HomeWork20181104;
/**
 * 测试类
 * 20181004作业
 * @author 赵宁
 * @班级 继续本18
 * @学号 118992215
 *
 */
public class TestAnimal {

	public static void main(String[] args) {
		//向上转型
		Animal b = new Bird("Bird1",3);
		Animal f = new Fish("Fish1",2);
		//观察多态
		b.run();
		f.run();

	}

}
