package TEST20181103;

public class Teacher extends Person{
	private String name;//����
	private int age;//����
	private int teachingage;//����
	
	/**
	 * �޲ι��췽��
	 */
	public Teacher() {
		System.out.println("teacher�޲ι��췽��");
	}
	
	/**
	 * �вι��췽��
	 * @param name
	 * @param age
	 * @param teachingage
	 */
	public Teacher(String name,int age,int teachingage) {
		super(name,age);//���ø����вι��췽������name��age����ȥ
		System.out.println("teacher�вι��췽��");
		this.teachingage=teachingage;
	}

	/**
	 * ��д���෽��
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
		Teacher t = new Teacher("��ʦA",20,35);
		System.out.println(t.getMessage());
	}
	
}
