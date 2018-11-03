package TEST20181103;

public class Person {

	private String name;//姓名
	private int age;//年龄
	
	/**
	 * 无参构造方法
	 */
	public Person() {
		System.out.println("父类无参构造方法");
	}
	
	/**
	 * 有参构造方法
	 * @param name
	 * @param age
	 */
	public Person(String name,int age) {
		System.out.println("父类有参构造方法");
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
