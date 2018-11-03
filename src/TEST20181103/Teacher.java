package TEST20181103;

public class Teacher extends Person{
	private String name;//姓名
	private int age;//年龄
	private int teachingage;//教龄
	
	/**
	 * 无参构造方法
	 */
	public Teacher() {
		System.out.println("teacher无参构造方法");
	}
	
	/**
	 * 有参构造方法
	 * @param name
	 * @param age
	 * @param teachingage
	 */
	public Teacher(String name,int age,int teachingage) {
		super(name,age);//调用父类有参构造方法并将name和age传过去
		System.out.println("teacher有参构造方法");
		this.teachingage=teachingage;
	}

	/**
	 * 重写父类方法
	 */
	public String getMessage() {
		return super.getMessage()+","+this.teachingage;
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

	public int getTeachingage() {
		return teachingage;
	}

	public void setTeachingage(int teachingage) {
		this.teachingage = teachingage;
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher("老师A",20,35);
		System.out.println(t.getMessage());
	}
	
}
