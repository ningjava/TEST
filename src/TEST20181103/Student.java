package TEST20181103;

public class Student extends Person {

	private int id;//学号

	/**
	 * 无参构造方法
	 */
	public Student() {
		//TODO 系统默认会调用父类无参构造方法
		System.out.println("子类无参构造方法");
	}
	
	/**
	 * 有参构造方法
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student(int id,String name,int age) {
		super(name,age);//调用父类有参构造方法，并将name和age传过去
		System.out.println("子类有参构造方法");
		this.id=id;
	}
	
	/**
	 * 重写父类方法
	 */
	public String getMessage() {
		return this.id+","+super.getMessage();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		/*Student s1 = new Student();//实例化无参对象
		s1.getMessage();*/
		Student s2 = new Student(1,"张三",20);//实例化无参对象
		System.out.println(s2.getMessage());
	}
}
