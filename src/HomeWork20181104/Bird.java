package HomeWork20181104;
/**
 * ��
 * 20181004��ҵ
 * @author ����
 * @�༶ ������18
 * @ѧ�� 118992215
 *
 */
public class Bird extends Animal {
	
	
	public Bird(String name, int age) {
		super(name, age);
	}

	/**
	 * ��д���෽��
	 */
	public void run() {
		System.out.println(super.getName()+" was "+super.getAge()+" years old,it flies by wings.");
	}
	
}
