package TEST20181103;

public class Person {

	private String name;//����
	private int age;//����
	
	/**
	 * �޲ι��췽��
	 */
	public Person() {
		System.out.println("�����޲ι��췽��");
	}
	
	/**
	 * �вι��췽��
	 * @param name
	 * @param age
	 */
	public Person(String name,int age) {
		System.out.println("�����вι��췽��");
		this.name=name;
		this.age=age;
	}
	
	public String getMessage() {
		return this.name+","+age;
	}

	
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
