package HomeWork20181104;
/**
 * ��
 * 20181004��ҵ
 * @author ����
 * @�༶ ������18
 * @ѧ�� 118992215
 *
 */
public class Fish extends Animal {

	public Fish(String name, int age) {
		super(name, age);
	}

	/**
	 * ��д���෽��
	 */
	public void run() {
		System.out.println(super.getName()+" was "+super.getAge()+" years old,it swims by Fins.");
	}
}
